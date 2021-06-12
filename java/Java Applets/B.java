import java.applet.Applet;
import java.awt.*;
/* <applet code="B" width="300" height="200">
<param name="site" value="www.vlsss.org"/>
</applet> */
public class B extends Applet{
private String defaultmessage="Hello!";
public void paint(Graphics g)
{
String s1=this.getParameter("site");
if(s1==null)
{
s1=defaultmessage;
}
g.drawString(s1,50,25);
}
}