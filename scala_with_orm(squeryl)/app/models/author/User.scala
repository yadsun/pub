package models.author

import play.api.libs.json.{Format, Json}
import slick.driver.PostgresDriver.api._
import slick.lifted.ProvenShape

/**
  * Created by denny on 15-11-11.
  */
case class User(userid:String,username:String,password:String,department:String,gendor:String, id: Option[Long] = None)  {
  var worknum:String= "00000"
  var rights:String= "000000000000000"

  def hasRight(rightId:Int):Boolean={
    rights match {
      case null=>false
      case x:String if x.length > 0 => x.charAt(rightId)=='1'//解析rights对应位的值 ‘0’表示无权限 ‘1’表示有权限
    }
  }

  def hasRight(text:String):Boolean={
    true
  }
}

object User{
  implicit val userFormat: Format[User] = Json.format[User]
}

class Users(tag:Tag) extends Table[User](tag,"cana_user") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def userId = column[String]("user_id")
  def userName = column[String]("user_name")
  def password = column[String]("password")
  def departmentId = column[String]("department_id")
  def gendor = column[String]("gendor")

  override def * : ProvenShape[User] = (userId,userName,password,departmentId,gendor,id.?)<>((User.apply _).tupled,User.unapply)
}
