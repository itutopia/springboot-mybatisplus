Hibernate Validated
======================================
@AssertFalse该字段的值只能为false

@CreditCardNumber对信用卡号进行一个大致的验证

@DecimalMax只能小于或等于该值

@DecimalMin只能大于或等于该值

@Digits(integer=,fraction=)检查是否是一种数字的整数、分数,小数位数的数字

@Email检查是否是一个有效的email地址

@Future检查该字段的日期是否是属于将来的日期

@Length(min=,max=)检查所属的字段的长度是否在min和max之间,只能用于字符串

@Max该字段的值只能小于或等于该值

@Min该字段的值只能大于或等于该值

@NotNull不能为null

@NotBlank不能为空，检查时会将空格忽略

@NotEmpty不能为空，这里的空是指空字符串

@Null检查该字段为空

@Past检查该字段的日期是在过去

@Pattern(regex=,flag=)被注释的元素必须符合指定的正则表达式

@Range(min=,max=,message=)被注释的元素必须在合适的范围内

@Size(min=, max=)检查该字段的size是否在min和max之间，可以是字符串、数组、集合、Map等

@URL(protocol=,host,port)检查是否是一个有效的URL，如果提供了protocol，host等，则该URL还需满足提供的条件

@Valid该注解主要用于字段为一个包含其他对象的集合或map或数组的字段，或该字段直接为一个其他对象的引用，这样在检查当前对象的同时也会检查该字段所引用的对象

Bean Validation 中内置的 constraint

@Null  被注释的元素必须为 null

@NotNull    被注释的元素必须不为 null

@AssertTrue    被注释的元素必须为 true

@AssertFalse    被注释的元素必须为 false

@Min(value)    被注释的元素必须是一个数字，其值必须大于等于指定的最小值

@Max(value)    被注释的元素必须是一个数字，其值必须小于等于指定的最大值

@DecimalMin(value)  被注释的元素必须是一个数字，其值必须大于等于指定的最小值

@DecimalMax(value)  被注释的元素必须是一个数字，其值必须小于等于指定的最大值

@Size(max=, min=)  被注释的元素的大小必须在指定的范围内

@Digits (integer, fraction)    被注释的元素必须是一个数字，其值必须在可接受的范围内

@Past  被注释的元素必须是一个过去的日期

@Future    被注释的元素必须是一个将来的日期

@Pattern(regex=,flag=)  被注释的元素必须符合指定的正则表达式

Hibernate Validator 附加的 constraint

@NotBlank(message =)  验证字符串非null，且长度必须大于0

@Email  被注释的元素必须是电子邮箱地址

@Length(min=,max=)  被注释的字符串的大小必须在指定的范围内

@NotEmpty  被注释的字符串的必须非空

@Range(min=,max=,message=)  被注释的元素必须在合适的范围内
————————————————
版权声明：本文为CSDN博主「weixin_39625008」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/weixin_39625008/article/details/114722834