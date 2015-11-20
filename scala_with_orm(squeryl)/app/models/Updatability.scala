package models

/**
  * Created by denny on 15-11-14.
  */
trait Updatability {
  var recorderId:Long = 0
  var recordTime:String = ""
  var updaterId:Long = 0
  var updateTime:String = ""

  var recorder :User
  var updater :User

  def recorderName():String = {
    if(recorder != null) recorder.username else "-"
  }

  def updaterName():String = {
    if(updater != null) recorder.username else "-"
  }
}
