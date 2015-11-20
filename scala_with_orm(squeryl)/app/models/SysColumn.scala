package models

/**
  * Created by denny on 15-11-16.
  */
case class SysColumn(val columnId:Int, val columnText:String) extends MyObject{
  override var recorder: User = _
  override var updater: User = _
  override var idx: Int = _

  var subColumnIds:String = "0000000000000000000000000000000000000000"   //40 sub columns 用来标识对应位的subColumnTexts的值是否有效
  var subColumnTexts:Seq[String] = Array[String]("","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","")  //40 sub columns


  def addSubColumn(text:String): Unit ={
      val r = subColumnOp(text)(text=>(subColumnIds,subColumnTexts),_=>{
        val availableId = subColumnTexts.indexOf(subColumnTexts.filter(_.length == 0).head)//找到第一个可用的项
        val f = subColumnIds.updated(availableId, '1')//同时将subColumnIds的对应位置1
        val s = subColumnTexts.updated(availableId, text) //将子功能添加到subColumnTexts
        (f,s)
      }
    )
      subColumnIds = r._1
      subColumnTexts = r._2
  }

  def removeSubColumn(text:String): Unit ={
    val r = subColumnOp(text)(ifContainsDo = text => {
      val idx = subColumnTexts.indexOf(text)//找到需要移除的子功能的位置
      val f = subColumnIds.updated(idx, '0')//同时将subColumnIds的对应位置0
      val s = subColumnTexts.updated(idx, "")//同时将subColumnTexts的对应位置清空
      (f, s)
    },notContainsDo = _ => (subColumnIds, subColumnTexts)
    )
    subColumnIds = r._1
    subColumnTexts = r._2
  }

  private def subColumnOp(text:String)(ifContainsDo:String=>(String,Seq[String]),notContainsDo:String=>(String,Seq[String])): (String,Seq[String]) ={
    if(subColumnTexts.contains(text)) ifContainsDo(text) else notContainsDo(text)
  }
}

object SysColumn{
  import scala.collection.mutable.ListBuffer
  val allColumns:ListBuffer[SysColumn] = ListBuffer[SysColumn]()
}
