<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleIP2GeoSoapProxyid" scope="session" class="com.cdyne.ws.IP2GeoSoapProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleIP2GeoSoapProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleIP2GeoSoapProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleIP2GeoSoapProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.cdyne.ws.IP2GeoSoap getIP2GeoSoap10mtemp = sampleIP2GeoSoapProxyid.getIP2GeoSoap();
if(getIP2GeoSoap10mtemp == null){
%>
<%=getIP2GeoSoap10mtemp %>
<%
}else{
        if(getIP2GeoSoap10mtemp!= null){
        String tempreturnp11 = getIP2GeoSoap10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String ipAddress_1id=  request.getParameter("ipAddress40");
            java.lang.String ipAddress_1idTemp = null;
        if(!ipAddress_1id.equals("")){
         ipAddress_1idTemp  = ipAddress_1id;
        }
        String licenseKey_2id=  request.getParameter("licenseKey42");
            java.lang.String licenseKey_2idTemp = null;
        if(!licenseKey_2id.equals("")){
         licenseKey_2idTemp  = licenseKey_2id;
        }
        com.cdyne.ws.IPInformation resolveIP13mtemp = sampleIP2GeoSoapProxyid.resolveIP(ipAddress_1idTemp,licenseKey_2idTemp);
if(resolveIP13mtemp == null){
%>
<%=resolveIP13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">regionName:</TD>
<TD>
<%
if(resolveIP13mtemp != null){
java.lang.String typeregionName16 = resolveIP13mtemp.getRegionName();
        String tempResultregionName16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeregionName16));
        %>
        <%= tempResultregionName16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">longitude:</TD>
<TD>
<%
if(resolveIP13mtemp != null){
%>
<%=resolveIP13mtemp.getLongitude()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">hasDaylightSavings:</TD>
<TD>
<%
if(resolveIP13mtemp != null){
%>
<%=resolveIP13mtemp.isHasDaylightSavings()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">organization:</TD>
<TD>
<%
if(resolveIP13mtemp != null){
java.lang.String typeorganization22 = resolveIP13mtemp.getOrganization();
        String tempResultorganization22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeorganization22));
        %>
        <%= tempResultorganization22 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">country:</TD>
<TD>
<%
if(resolveIP13mtemp != null){
java.lang.String typecountry24 = resolveIP13mtemp.getCountry();
        String tempResultcountry24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecountry24));
        %>
        <%= tempResultcountry24 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">city:</TD>
<TD>
<%
if(resolveIP13mtemp != null){
java.lang.String typecity26 = resolveIP13mtemp.getCity();
        String tempResultcity26 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecity26));
        %>
        <%= tempResultcity26 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">countryCode:</TD>
<TD>
<%
if(resolveIP13mtemp != null){
java.lang.String typecountryCode28 = resolveIP13mtemp.getCountryCode();
        String tempResultcountryCode28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecountryCode28));
        %>
        <%= tempResultcountryCode28 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">areaCode:</TD>
<TD>
<%
if(resolveIP13mtemp != null){
java.lang.String typeareaCode30 = resolveIP13mtemp.getAreaCode();
        String tempResultareaCode30 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeareaCode30));
        %>
        <%= tempResultareaCode30 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">certainty:</TD>
<TD>
<%
if(resolveIP13mtemp != null){
%>
<%=resolveIP13mtemp.getCertainty()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">stateProvince:</TD>
<TD>
<%
if(resolveIP13mtemp != null){
java.lang.String typestateProvince34 = resolveIP13mtemp.getStateProvince();
        String tempResultstateProvince34 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestateProvince34));
        %>
        <%= tempResultstateProvince34 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">latitude:</TD>
<TD>
<%
if(resolveIP13mtemp != null){
%>
<%=resolveIP13mtemp.getLatitude()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">timeZone:</TD>
<TD>
<%
if(resolveIP13mtemp != null){
java.lang.String typetimeZone38 = resolveIP13mtemp.getTimeZone();
        String tempResulttimeZone38 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetimeZone38));
        %>
        <%= tempResulttimeZone38 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>