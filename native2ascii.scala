class NativeTool(){
  val PREFIX = "\\u";
  def native2Ascii(chars:CharSequence):CharSequence={
    
  }
  def char2Ascii(char:Char):CharSequence={
    var res = ""
    if(c>255){
      var temp = (c>>8).toHexString 
      res+=PREFIX+if(temp.length==1) "0"+temp else temp
      
      temp=(c&0xFF).toHexString
      res+=if(temp.length==1) "0"+temp else temp
    }else{
      res = c.toString
    }
    
    res
  }
  def ascii2Native(asciis:CharSequence):CharSequence={
    
  }
  def ascii2Char(ascii:CharSequence):Char={
    
  }
}
