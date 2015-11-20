package controllers

import models._
import play.api._
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.format.Formats._
import play.api.data.validation.Constraint._
import play.api.libs.json.Json
import play.api.mvc._
import scala.collection.mutable.ArrayBuffer
import scala.concurrent.ExecutionContext.Implicits.global

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  val userForm:Form[User] = Form{
    mapping(
      "userid"->nonEmptyText,
      "username"->text,
      "password"->text,
      "department"->text,
      "gendor"->text,
      "id"->optional(longNumber)
    )(User.apply)(User.unapply)
  }

  def regist = Action{implicit request=>
    val user = userForm.bindFromRequest.get
    import slick.driver.PostgresDriver.api._

    // the base query for the Users table
    val users = TableQuery[Users]

    val objs = new ArrayBuffer[User]

    MyDB.done({db=>
      Await.result(db.run(DBIO.seq(
        // print the users (select * from USERS)
        users.result.map(x=>{
          for(xx<-x) objs+=xx
        })
      )), Duration.Inf)
    })

    Ok(views.html.index("Regist success."))
  }

  def userlist = Action{implicit  request=>
    import slick.driver.PostgresDriver.api._
    val users = TableQuery[Users]
    val userlist = new ArrayBuffer[User]
    MyDB.done({
      db=>
        Await.result(db.run(DBIO.seq(
          // print the users (select * from USERS)
          users.result.map(x=>{
            for(xx<-x) userlist+=xx
          })
        )), Duration.Inf)
    })

    Ok(Json.toJson(userlist))
  }
}