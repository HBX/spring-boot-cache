package pers.hbx.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 类描述：
 * <p>
 * <pre>
 * -------------History------------------
 *   DATE                     AUTHOR         VERSION        DESCRIPTION
 *   2018年08月31日 11:29      Bluesky       V01.00.001		  新增内容
 * </pre>
 *
 * @author <a href="mailto:huangbingxin@zhangkongapp.com">黄兵新</a>
 */
@Setter
@Getter
public class User {
    private Long id;
    private String name;
    private String pass;

    @Override
    public String toString() {
        return String.format("id=%d,name=%s,pass=%s", this.id, this.name, this.pass);
    }
}
