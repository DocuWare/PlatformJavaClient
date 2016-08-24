

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import com.docuware.dev.settings.interop.DWProductTypes;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginInfo")
public class LoginInfo  {

    @XmlAttribute(name = "PasswordExpireNotification")
    protected Duration passwordExpireNotification;
    @XmlAttribute(name = "BookedLicense", required = true)
    protected DWProductTypes bookedLicense;

    /**Define the period of time when password will expire.
          This parameter contains a time interval specification in the form:
          [ws][-]{ d | [d.]hh:mm[:ss[.ff]] }[ws]
          Elements in square brackets ([ and ]) are optional. One selection from the list of alternatives enclosed in braces ({ and }) and separated by vertical bars (|) is required.
          For more details check http://msdn.microsoft.com/en-us/library/se73z7b9.aspx*/
    public Duration getPasswordExpireNotification() {
        return passwordExpireNotification;
    }

    /**Define the period of time when password will expire.
          This parameter contains a time interval specification in the form:
          [ws][-]{ d | [d.]hh:mm[:ss[.ff]] }[ws]
          Elements in square brackets ([ and ]) are optional. One selection from the list of alternatives enclosed in braces ({ and }) and separated by vertical bars (|) is required.
          For more details check http://msdn.microsoft.com/en-us/library/se73z7b9.aspx*/
    public void setPasswordExpireNotification(Duration value) {
        this.passwordExpireNotification = value;
    }

    /**License that is booked for the login*/
    public DWProductTypes getBookedLicense() {
        return bookedLicense;
    }

    /**License that is booked for the login*/
    public void setBookedLicense(DWProductTypes value) {
        this.bookedLicense = value;
    }



}
