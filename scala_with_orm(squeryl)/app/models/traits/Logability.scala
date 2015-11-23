package models.traits

import models.MyLog

/**
  * Created by denny on 15-11-14.
  */
trait Logability {
  var lastLog:MyLog = _
  var logs:Seq[MyLog] = _

  def currentLog():MyLog=lastLog
}
