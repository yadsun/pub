import models.{Users, MyDB, User}
import play.api.Play.current

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.collection.mutable.ArrayBuffer

/**
  * Created by denny on 15-11-16.
  */
object TestCaseORM extends App{
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

  objs.foreach(println)

}
