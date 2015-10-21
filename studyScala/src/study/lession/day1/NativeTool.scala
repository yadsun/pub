package study.lession.day1

class NativeTool {
  val PREFIX = "\\u";
  def native2Ascii(chars: CharSequence): CharSequence = {
    var sb = new StringBuilder()
    for (c <- chars.toString) {
      sb.append(char2Ascii(c))
    }

    sb.toString()
  }

  def char2Ascii(c: Char): CharSequence = {
    var res = ""
    if (c.toInt<65 || c.toInt>122 || (c.toInt>90 && c.toInt<97)) {
      var temp = (c >> 8).toHexString
      res += PREFIX + (if (temp.length == 1) "0" + temp else temp)

      temp = (c & 0xFF).toHexString
      res += (if (temp.length == 1) "0" + temp else temp)
    } else {
      res = c.toString
    }

    res
  }
  def ascii2Native(str: CharSequence): CharSequence = {
    var sb = new StringBuilder()
    var begin = 0
    var index = str.toString.indexOf(PREFIX)
    while (index != -1) {
      sb.append(str.subSequence(begin, index))
      sb.append(ascii2Char(str.subSequence(index, index + 6)))
      begin = index + 6
      index = str.toString.indexOf(PREFIX, begin)
    }
    sb.append(str.toString().substring(begin))
    sb.toString()
  }

  def ascii2Char(asc: CharSequence): Char = {
    var tmp = asc.subSequence(2, 4).toString
    var code = (Integer.parseInt(tmp, 16) << 8)
    tmp = asc.subSequence(4, 6).toString
    code += Integer.parseInt(tmp, 16)
    code.toChar
  }
}