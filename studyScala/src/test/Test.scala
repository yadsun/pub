package test

import org.scalatest.FlatSpec
import study.lession.day1.NativeTool

class Test extends FlatSpec {
  "strings on left of '==='" should " be converted and equals strings on right of '==='" in {
    var nt = new NativeTool()
    assert(nt.native2Ascii("中abc") === "\\u4e2dabc")
    assert(nt.ascii2Native("\\u4e2dabc").toString === "中abc")
    assert(nt.native2Ascii("路·").toString === "\\u8def\\u00b7")
    assert(nt.ascii2Native("\\u8def\\u00b7").toString === "路·")
    assert(nt.native2Ascii("声明：此为贴吧助手插件的功能，不是百度贴吧原有功能～。设置称呼后，在帖子页面，您设置的称呼将会自动显示在自己的头像上。").toString ===
      "\\u58f0\\u660e\\uff1a\\u6b64\\u4e3a\\u8d34\\u5427\\u52a9\\u624b\\u63d2\\u4ef6\\u7684\\u529f\\u80fd\\uff0c\\u4e0d\\u662f\\u767e\\u5ea6\\u8d34\\u5427\\u539f\\u6709\\u529f\\u80fd\\uff5e\\u3002\\u8bbe\\u7f6e\\u79f0\\u547c\\u540e\\uff0c\\u5728\\u5e16\\u5b50\\u9875\\u9762\\uff0c\\u60a8\\u8bbe\\u7f6e\\u7684\\u79f0\\u547c\\u5c06\\u4f1a\\u81ea\\u52a8\\u663e\\u793a\\u5728\\u81ea\\u5df1\\u7684\\u5934\\u50cf\\u4e0a\\u3002")
    assert(nt.ascii2Native("\\u58f0\\u660e\\uff1a\\u6b64\\u4e3a\\u8d34\\u5427\\u52a9\\u624b\\u63d2\\u4ef6\\u7684\\u529f\\u80fd\\uff0c\\u4e0d\\u662f\\u767e\\u5ea6\\u8d34\\u5427\\u539f\\u6709\\u529f\\u80fd\\uff5e\\u3002\\u8bbe\\u7f6e\\u79f0\\u547c\\u540e\\uff0c\\u5728\\u5e16\\u5b50\\u9875\\u9762\\uff0c\\u60a8\\u8bbe\\u7f6e\\u7684\\u79f0\\u547c\\u5c06\\u4f1a\\u81ea\\u52a8\\u663e\\u793a\\u5728\\u81ea\\u5df1\\u7684\\u5934\\u50cf\\u4e0a\\u3002").toString === "声明：此为贴吧助手插件的功能，不是百度贴吧原有功能～。设置称呼后，在帖子页面，您设置的称呼将会自动显示在自己的头像上。")
  }
}