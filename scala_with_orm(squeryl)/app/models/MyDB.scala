package models

import slick.driver.PostgresDriver.api._

/**
  * Created by denny on 15-11-18.
  */
object MyDB {
  def done(fun:Database=>Unit, config:String = "crmdb"):Unit={
    val db = Database.forConfig(config)
    try {
      fun(db)
    } finally db.close
  }
}
