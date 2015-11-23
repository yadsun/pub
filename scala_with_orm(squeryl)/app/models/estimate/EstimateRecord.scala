package models.estimate

import models.{MyObjects, MyObject}
import models.author.User
import play.api.libs.json.{Format, Json}
import slick.driver.PostgresDriver.api._
import slick.lifted.ProvenShape

/**
  * Created by denny on 15-11-23.
  */
case class EstimateRecord(beEstimated:String, estimate:String,item1:Double, item2:Double, item3:Double, item4:Double,
                          item5:Double,item6:Double, item7:Double, item8:Double, item9:Double, item10:Double, item11:Double,
                          item12:Double,item13:Double, item14:Double, item15:Double, item16:Double, item17:Double, item18:Double,
                          item19:Double,item20:Double, item21:Double, item22:Double, item23:Double, item24:Double, item25:Double,
                          item26:Double,item27:Double, item28:Double, item29:Double, item30:Double, item31:Double, item32:Double,
                          item33:Double,item34:Double, item35:Double, item36:Double, item37:Double, item38:Double, item39:Double,
                          item40:Double,id: Option[Long] = None){
  def this(beEstimated:String, estimate:String){
    this(beEstimated,estimate,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
  }

  def this(beEstimated:String, estimate:String,recorderId:Long,recordTime:String,updaterId:Long,updateTime:String,status:Int,
                         item1:Double, item2:Double, item3:Double, item4:Double,
                         item5:Double,item6:Double, item7:Double, item8:Double, item9:Double, item10:Double, item11:Double,
                         item12:Double,item13:Double, item14:Double, item15:Double, item16:Double, item17:Double, item18:Double,
                         item19:Double,item20:Double, item21:Double, item22:Double, item23:Double, item24:Double, item25:Double,
                         item26:Double,item27:Double, item28:Double, item29:Double, item30:Double, item31:Double, item32:Double,
                         item33:Double,item34:Double, item35:Double, item36:Double, item37:Double, item38:Double, item39:Double,
                         item40:Double,id: Option[Long] = None){
    this(beEstimated,estimate,item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, item13, item14, item15, item16, item17, item18, item19, item20, item21, item22, item23, item24, item25, item26, item27, item28, item29, item30, item31, item32, item33, item34, item35, item36, item37, item38, item39, item40)

  }
}

object EstimateRecord{
  implicit val estimateRecordFormat = Json.format[EstimateRecord]
}

class EstimateRecords(tag:Tag) extends Table[EstimateRecord](tag, "cana_estimate_record") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def beEstimated = column[String]("be_estimated")
  def estimate = column[String]("estimate")
  def item1 = column[Double]("item1")
  def item2 = column[Double]("item2")
  def item3 = column[Double]("item3")
  def item4 = column[Double]("item4")
  def item5 = column[Double]("item5")
  def item6 = column[Double]("item6")
  def item7 = column[Double]("item7")
  def item8 = column[Double]("item8")
  def item9 = column[Double]("item9")
  def item10 = column[Double]("item10")
  def item11 = column[Double]("item11")
  def item12 = column[Double]("item12")
  def item13 = column[Double]("item13")
  def item14 = column[Double]("item14")
  def item15 = column[Double]("item15")
  def item16 = column[Double]("item16")
  def item17 = column[Double]("item17")
  def item18 = column[Double]("item18")
  def item19 = column[Double]("item19")
  def item20 = column[Double]("item20")
  def item21 = column[Double]("item21")
  def item22 = column[Double]("item22")
  def item23 = column[Double]("item23")
  def item24 = column[Double]("item24")
  def item25 = column[Double]("item25")
  def item26 = column[Double]("item26")
  def item27 = column[Double]("item27")
  def item28 = column[Double]("item28")
  def item29 = column[Double]("item29")
  def item30 = column[Double]("item30")
  def item31 = column[Double]("item31")
  def item32 = column[Double]("item32")
  def item33 = column[Double]("item33")
  def item34 = column[Double]("item34")
  def item35 = column[Double]("item35")
  def item36 = column[Double]("item36")
  def item37 = column[Double]("item37")
  def item38 = column[Double]("item38")
  def item39 = column[Double]("item39")
  def item40 = column[Double]("item40")

  override def * : ProvenShape[EstimateRecord] = (beEstimated,estimate,item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, item13, item14, item15, item16, item17, item18, item19, item20, item21, item22, item23, item24, item25, item26, item27, item28, item29, item30, item31, item32, item33, item34, item35, item36, item37, item38, item39, item40 ,id.?)<>((EstimateRecord.apply _).tupled, EstimateRecord.unapply)
}

