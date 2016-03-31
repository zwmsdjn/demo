/**
 *Copyright (c) 1997, 2015,BEST WONDER CO.,LTD. All rights reserved.
 */

package bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
  * @ClassName: Commonfpkjxmxx
  * @Description: TODO
  * @author wsdoing
  * @date 2016�?�?�?下午2:26:49
  */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fpmx"
})
public class Commonfpkjxmxxs {

    @XmlElement(name = "COMMON_FPKJ_XMXX")
    protected List<Fpmx> fpmx;

    public List<Fpmx> getFpmx() {
        if (fpmx == null) {
        	fpmx = new ArrayList<Fpmx>();
        }
        return fpmx;
    }

}
