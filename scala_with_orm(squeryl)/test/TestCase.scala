import models._

/**
  * Created by denny on 15-11-14.
  */
object TestCase{
  def main(args: Array[String]): Unit = {
//    val c1 = SysColumn(1,"我的办公室")
//    val c2 = SysColumn(2,"退出")
//
//    c1.idx = 10
//    c2.idx = 20
//
//    println(c1.recorderName)
//    println(c2.recorderName)
//    println(c1.columnText)
//    println(c2.columnText)

    //******************************
//      val a = "00000000"
//      println(a.updated(1,'1').mkString(""))
//      println(a.replace('0','1'))
    //******************************
    val c1 = SysColumn(1,"客户信息")
    c1.addSubColumn("添加")
    c1.addSubColumn("删除")
    c1.addSubColumn("修改")
    c1.addSubColumn("审核")

    println(c1.subColumnIds+"------"+c1.subColumnTexts.mkString(","))
    c1.removeSubColumn("添加")
    c1.removeSubColumn("修改")
    c1.removeSubColumn("审核")
    println(c1.subColumnIds+"------"+c1.subColumnTexts.mkString(","))
    c1.addSubColumn("添加")
    println(c1.subColumnIds+"------"+c1.subColumnTexts.mkString(","))


    val c2 = SysColumn(2,"统计分析")
    c2.addSubColumn("客户统计")
    c2.addSubColumn("销贷单统计")
    c2.addSubColumn("服务单统计")

    println(c2.subColumnIds+"------"+c2.subColumnTexts.mkString(","))

    c2.removeSubColumn("客户统计")
    c2.addSubColumn("销贷单统计")
    c2.addSubColumn("新客户统计")
    println(c2.subColumnIds+"------"+c2.subColumnTexts.mkString(","))

    val c3 = SysColumn(3,"我的办公室")
    c3.addSubColumn("未读消息")
    c3.addSubColumn("待处理事项")
    c3.addSubColumn("工作列表")


    val u1 = User("10009","开能","111111","IT","Ｍ")
    u1.rights="100000000000"
    println(u1.hasRight(1))

    SysColumn.allColumns+=c2
    SysColumn.allColumns+=c3


    //从功能列表总表中打印功能名称
    SysColumn.allColumns.map(_ match {
      case SysColumn(_:Int,y:String)=>y
      case _=>""
    }).map(println)
  }
}
