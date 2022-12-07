package bean;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.Data;

import java.lang.reflect.Type;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
@TableName(autoResultMap = true)
public class Test {
        @TableLogic(value = "null",delval = "now()")
        @TableField(value = "TestDate")
    private Date TestDate;
        @TableId(type = IdType.AUTO)
        private int id;

       @TableField(typeHandler = JacksonTypeHandler.class)
    private User user;
}
