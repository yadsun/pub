package models

/**
  * Created by denny on 15-11-14.
  */
case class MyLog(logText:String) {
  var id:Long = 0 //primary key
  var prevLogId:Long = 0
  var nextLogId:Long = 0
}

object MyLog{

}