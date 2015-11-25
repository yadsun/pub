package models
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = slick.driver.PostgresDriver
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: slick.driver.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = CanaEstimateRecord.schema ++ CanaUser.schema
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Row type of table CanaEstimateRecord */
  type CanaEstimateRecordRow = HCons[Int,HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Int],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[Double],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for CanaEstimateRecordRow providing default values if available in the database schema. */
  def CanaEstimateRecordRow(id: Int, recorderId: Option[String] = None, recordTime: Option[String] = None, updaterId: Option[String] = None, updateTime: Option[String] = None, status: Option[Int] = None, item1: Option[Double] = None, item2: Option[Double] = None, item3: Option[Double] = None, item4: Option[Double] = None, item5: Option[Double] = None, item6: Option[Double] = None, item7: Option[Double] = None, item8: Option[Double] = None, item9: Option[Double] = None, item10: Option[Double] = None, item11: Option[Double] = None, item12: Option[Double] = None, item13: Option[Double] = None, item14: Option[Double] = None, item15: Option[Double] = None, item16: Option[Double] = None, item17: Option[Double] = None, item18: Option[Double] = None, item19: Option[Double] = None, item20: Option[Double] = None, item21: Option[Double] = None, item22: Option[Double] = None, item23: Option[Double] = None, item24: Option[Double] = None, item25: Option[Double] = None, item26: Option[Double] = None, item27: Option[Double] = None, item28: Option[Double] = None, item29: Option[Double] = None, item30: Option[Double] = None, item31: Option[Double] = None, item32: Option[Double] = None, item33: Option[Double] = None, item34: Option[Double] = None, item35: Option[Double] = None, item36: Option[Double] = None, item37: Option[Double] = None, item38: Option[Double] = None, item39: Option[Double] = None, item40: Option[Double] = None, beEstimated: Option[String] = None, estimate: Option[String] = None): CanaEstimateRecordRow = {
    id :: recorderId :: recordTime :: updaterId :: updateTime :: status :: item1 :: item2 :: item3 :: item4 :: item5 :: item6 :: item7 :: item8 :: item9 :: item10 :: item11 :: item12 :: item13 :: item14 :: item15 :: item16 :: item17 :: item18 :: item19 :: item20 :: item21 :: item22 :: item23 :: item24 :: item25 :: item26 :: item27 :: item28 :: item29 :: item30 :: item31 :: item32 :: item33 :: item34 :: item35 :: item36 :: item37 :: item38 :: item39 :: item40 :: beEstimated :: estimate :: HNil
  }
  /** GetResult implicit for fetching CanaEstimateRecordRow objects using plain SQL queries */
  implicit def GetResultCanaEstimateRecordRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[Int]], e3: GR[Option[Double]]): GR[CanaEstimateRecordRow] = GR{
    prs => import prs._
    <<[Int] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Int] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[Double] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table cana_estimate_record. Objects of this class serve as prototypes for rows in queries. */
  class CanaEstimateRecord(_tableTag: Tag) extends Table[CanaEstimateRecordRow](_tableTag, "cana_estimate_record") {
    def * = id :: recorderId :: recordTime :: updaterId :: updateTime :: status :: item1 :: item2 :: item3 :: item4 :: item5 :: item6 :: item7 :: item8 :: item9 :: item10 :: item11 :: item12 :: item13 :: item14 :: item15 :: item16 :: item17 :: item18 :: item19 :: item20 :: item21 :: item22 :: item23 :: item24 :: item25 :: item26 :: item27 :: item28 :: item29 :: item30 :: item31 :: item32 :: item33 :: item34 :: item35 :: item36 :: item37 :: item38 :: item39 :: item40 :: beEstimated :: estimate :: HNil

    /** Database column id SqlType(serial), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column recorder_id SqlType(varchar), Length(10,true), Default(None) */
    val recorderId: Rep[Option[String]] = column[Option[String]]("recorder_id", O.Length(10,varying=true), O.Default(None))
    /** Database column record_time SqlType(varchar), Length(20,true), Default(None) */
    val recordTime: Rep[Option[String]] = column[Option[String]]("record_time", O.Length(20,varying=true), O.Default(None))
    /** Database column updater_id SqlType(varchar), Length(10,true), Default(None) */
    val updaterId: Rep[Option[String]] = column[Option[String]]("updater_id", O.Length(10,varying=true), O.Default(None))
    /** Database column update_time SqlType(varchar), Length(20,true), Default(None) */
    val updateTime: Rep[Option[String]] = column[Option[String]]("update_time", O.Length(20,varying=true), O.Default(None))
    /** Database column status SqlType(int4), Default(None) */
    val status: Rep[Option[Int]] = column[Option[Int]]("status", O.Default(None))
    /** Database column item1 SqlType(float8), Default(None) */
    val item1: Rep[Option[Double]] = column[Option[Double]]("item1", O.Default(None))
    /** Database column item2 SqlType(float8), Default(None) */
    val item2: Rep[Option[Double]] = column[Option[Double]]("item2", O.Default(None))
    /** Database column item3 SqlType(float8), Default(None) */
    val item3: Rep[Option[Double]] = column[Option[Double]]("item3", O.Default(None))
    /** Database column item4 SqlType(float8), Default(None) */
    val item4: Rep[Option[Double]] = column[Option[Double]]("item4", O.Default(None))
    /** Database column item5 SqlType(float8), Default(None) */
    val item5: Rep[Option[Double]] = column[Option[Double]]("item5", O.Default(None))
    /** Database column item6 SqlType(float8), Default(None) */
    val item6: Rep[Option[Double]] = column[Option[Double]]("item6", O.Default(None))
    /** Database column item7 SqlType(float8), Default(None) */
    val item7: Rep[Option[Double]] = column[Option[Double]]("item7", O.Default(None))
    /** Database column item8 SqlType(float8), Default(None) */
    val item8: Rep[Option[Double]] = column[Option[Double]]("item8", O.Default(None))
    /** Database column item9 SqlType(float8), Default(None) */
    val item9: Rep[Option[Double]] = column[Option[Double]]("item9", O.Default(None))
    /** Database column item10 SqlType(float8), Default(None) */
    val item10: Rep[Option[Double]] = column[Option[Double]]("item10", O.Default(None))
    /** Database column item11 SqlType(float8), Default(None) */
    val item11: Rep[Option[Double]] = column[Option[Double]]("item11", O.Default(None))
    /** Database column item12 SqlType(float8), Default(None) */
    val item12: Rep[Option[Double]] = column[Option[Double]]("item12", O.Default(None))
    /** Database column item13 SqlType(float8), Default(None) */
    val item13: Rep[Option[Double]] = column[Option[Double]]("item13", O.Default(None))
    /** Database column item14 SqlType(float8), Default(None) */
    val item14: Rep[Option[Double]] = column[Option[Double]]("item14", O.Default(None))
    /** Database column item15 SqlType(float8), Default(None) */
    val item15: Rep[Option[Double]] = column[Option[Double]]("item15", O.Default(None))
    /** Database column item16 SqlType(float8), Default(None) */
    val item16: Rep[Option[Double]] = column[Option[Double]]("item16", O.Default(None))
    /** Database column item17 SqlType(float8), Default(None) */
    val item17: Rep[Option[Double]] = column[Option[Double]]("item17", O.Default(None))
    /** Database column item18 SqlType(float8), Default(None) */
    val item18: Rep[Option[Double]] = column[Option[Double]]("item18", O.Default(None))
    /** Database column item19 SqlType(float8), Default(None) */
    val item19: Rep[Option[Double]] = column[Option[Double]]("item19", O.Default(None))
    /** Database column item20 SqlType(float8), Default(None) */
    val item20: Rep[Option[Double]] = column[Option[Double]]("item20", O.Default(None))
    /** Database column item21 SqlType(float8), Default(None) */
    val item21: Rep[Option[Double]] = column[Option[Double]]("item21", O.Default(None))
    /** Database column item22 SqlType(float8), Default(None) */
    val item22: Rep[Option[Double]] = column[Option[Double]]("item22", O.Default(None))
    /** Database column item23 SqlType(float8), Default(None) */
    val item23: Rep[Option[Double]] = column[Option[Double]]("item23", O.Default(None))
    /** Database column item24 SqlType(float8), Default(None) */
    val item24: Rep[Option[Double]] = column[Option[Double]]("item24", O.Default(None))
    /** Database column item25 SqlType(float8), Default(None) */
    val item25: Rep[Option[Double]] = column[Option[Double]]("item25", O.Default(None))
    /** Database column item26 SqlType(float8), Default(None) */
    val item26: Rep[Option[Double]] = column[Option[Double]]("item26", O.Default(None))
    /** Database column item27 SqlType(float8), Default(None) */
    val item27: Rep[Option[Double]] = column[Option[Double]]("item27", O.Default(None))
    /** Database column item28 SqlType(float8), Default(None) */
    val item28: Rep[Option[Double]] = column[Option[Double]]("item28", O.Default(None))
    /** Database column item29 SqlType(float8), Default(None) */
    val item29: Rep[Option[Double]] = column[Option[Double]]("item29", O.Default(None))
    /** Database column item30 SqlType(float8), Default(None) */
    val item30: Rep[Option[Double]] = column[Option[Double]]("item30", O.Default(None))
    /** Database column item31 SqlType(float8), Default(None) */
    val item31: Rep[Option[Double]] = column[Option[Double]]("item31", O.Default(None))
    /** Database column item32 SqlType(float8), Default(None) */
    val item32: Rep[Option[Double]] = column[Option[Double]]("item32", O.Default(None))
    /** Database column item33 SqlType(float8), Default(None) */
    val item33: Rep[Option[Double]] = column[Option[Double]]("item33", O.Default(None))
    /** Database column item34 SqlType(float8), Default(None) */
    val item34: Rep[Option[Double]] = column[Option[Double]]("item34", O.Default(None))
    /** Database column item35 SqlType(float8), Default(None) */
    val item35: Rep[Option[Double]] = column[Option[Double]]("item35", O.Default(None))
    /** Database column item36 SqlType(float8), Default(None) */
    val item36: Rep[Option[Double]] = column[Option[Double]]("item36", O.Default(None))
    /** Database column item37 SqlType(float8), Default(None) */
    val item37: Rep[Option[Double]] = column[Option[Double]]("item37", O.Default(None))
    /** Database column item38 SqlType(float8), Default(None) */
    val item38: Rep[Option[Double]] = column[Option[Double]]("item38", O.Default(None))
    /** Database column item39 SqlType(float8), Default(None) */
    val item39: Rep[Option[Double]] = column[Option[Double]]("item39", O.Default(None))
    /** Database column item40 SqlType(float8), Default(None) */
    val item40: Rep[Option[Double]] = column[Option[Double]]("item40", O.Default(None))
    /** Database column be_estimated SqlType(varchar), Length(10,true), Default(None) */
    val beEstimated: Rep[Option[String]] = column[Option[String]]("be_estimated", O.Length(10,varying=true), O.Default(None))
    /** Database column estimate SqlType(varchar), Length(10,true), Default(None) */
    val estimate: Rep[Option[String]] = column[Option[String]]("estimate", O.Length(10,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table CanaEstimateRecord */
  lazy val CanaEstimateRecord = new TableQuery(tag => new CanaEstimateRecord(tag))

  /** Entity class storing rows of table CanaUser
   *  @param id Database column id SqlType(serial), AutoInc, PrimaryKey
   *  @param userId Database column user_id SqlType(varchar), Length(10,true), Default(None)
   *  @param userName Database column user_name SqlType(varchar), Length(20,true), Default(None)
   *  @param password Database column password SqlType(varchar), Length(10,true), Default(None)
   *  @param gendor Database column gendor SqlType(varchar), Length(5,true), Default(None)
   *  @param departmentId Database column department_id SqlType(varchar), Length(10,true), Default(None)
   *  @param status Database column status SqlType(int4), Default(None) */
  case class CanaUserRow(id: Int, userId: Option[String] = None, userName: Option[String] = None, password: Option[String] = None, gendor: Option[String] = None, departmentId: Option[String] = None, status: Option[Int] = None)
  /** GetResult implicit for fetching CanaUserRow objects using plain SQL queries */
  implicit def GetResultCanaUserRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[Int]]): GR[CanaUserRow] = GR{
    prs => import prs._
    CanaUserRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Int]))
  }
  /** Table description of table cana_user. Objects of this class serve as prototypes for rows in queries. */
  class CanaUser(_tableTag: Tag) extends Table[CanaUserRow](_tableTag, "cana_user") {
    def * = (id, userId, userName, password, gendor, departmentId, status) <> (CanaUserRow.tupled, CanaUserRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), userId, userName, password, gendor, departmentId, status).shaped.<>({r=>import r._; _1.map(_=> CanaUserRow.tupled((_1.get, _2, _3, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(serial), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column user_id SqlType(varchar), Length(10,true), Default(None) */
    val userId: Rep[Option[String]] = column[Option[String]]("user_id", O.Length(10,varying=true), O.Default(None))
    /** Database column user_name SqlType(varchar), Length(20,true), Default(None) */
    val userName: Rep[Option[String]] = column[Option[String]]("user_name", O.Length(20,varying=true), O.Default(None))
    /** Database column password SqlType(varchar), Length(10,true), Default(None) */
    val password: Rep[Option[String]] = column[Option[String]]("password", O.Length(10,varying=true), O.Default(None))
    /** Database column gendor SqlType(varchar), Length(5,true), Default(None) */
    val gendor: Rep[Option[String]] = column[Option[String]]("gendor", O.Length(5,varying=true), O.Default(None))
    /** Database column department_id SqlType(varchar), Length(10,true), Default(None) */
    val departmentId: Rep[Option[String]] = column[Option[String]]("department_id", O.Length(10,varying=true), O.Default(None))
    /** Database column status SqlType(int4), Default(None) */
    val status: Rep[Option[Int]] = column[Option[Int]]("status", O.Default(None))
  }
  /** Collection-like TableQuery object for table CanaUser */
  lazy val CanaUser = new TableQuery(tag => new CanaUser(tag))
}
