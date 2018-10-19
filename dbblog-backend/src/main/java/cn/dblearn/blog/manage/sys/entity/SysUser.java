package cn.dblearn.blog.manage.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * <p>
 * 用户管理
 * </p>
 *
 * @author bobbi
 * @since 2018-10-08
 */
@Data
@ApiModel(value="SysUser对象", description="用户管理")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "密码盐")
    private String salt;

    @ApiModelProperty(value = "创建者Id")
    private String createUserId;

    @ApiModelProperty(value = "创建时间")
    private String createTime;

    @ApiModelProperty(value = "0禁用，1正常")
    private Integer status;


}
