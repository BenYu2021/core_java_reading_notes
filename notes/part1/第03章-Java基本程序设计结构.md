# 第 03 章-Java 基本程序设计结构

## 3.1 一个简单的 Java 程序设计

```java
    public class FirstSample {
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
    }
```

## 3.2 注释

```java
    // 单行注释
    /*
    多行注释
     */
    
    /**
     * 文档注释
     * @param args
     */
```

## 3.3 数据类型
    1.Java是强类型语言
    
    2.基本数据类型（8种）
        4种整型：byte、short、int、long、
        2种浮点：float、double
        1种字符：char
        1种表示真值：boolean
        
|类型|存储需求|取值范围|
| --- | --- | --- |
|int    |	4字节（32bit）|	~20多亿|
|short  |	2字节 |	-32768~32767|
|long   |	8字节（64bit）|	|
|byte   |	1字节（8bit）|	-128~127|
|float  |	4字节 |（有效位数6~7）|
|double（小数默认）   |	8字节|	（有效位数15位）|
|char   |	2字节 |	\u0000~\uFFFF|
|boolean|	|	true、false|

### 3.3.1 整型

### 3.3.2 浮点

### 3.3.3 char类型

1. char类型描述了UTF-16编码中的一个代码单元。
2. 议在Java中使用char类型，除非实际需要处理UTF-16代码单元。
3. 最好用字符串作为*抽象数据类型处理*。

### 3.3.4 boolean类型

#### 基本类型的包装类

1. 布尔值的比较逻辑Boolean.compare(x, y)

```java
    public static int compare(boolean x, boolean y) {
        return (x == y) ? 0 : (x ? 1 : -1);
    }

    public int compareTo(Boolean b) {
        return compare(this.value, b.value);
    }
```

## 3.4 常量与变量
1.	声明变量
2.	变量初始化
3.	常量：final修饰
4.	枚举类型：变量的取值只在一个有限的集合内

## 3.5运算符
### 3.5.1 算数运算符

1.	strictfp标记的方法必须使用严格的浮点计算生成可再生的结果

### 3.5.2 数学函数与常量
    1.	Java没有幂运算，函数Math.pow(x,a)
    2.	取余问题：
        (1)	数学上余数>=0
        (2)	Java中：
            -7 % 2 为 -1
        Math.floorMod(-7,2) 为 1
        (3)	
    3.	java.lang.Math和java.lang.StrictMath
        Math类为了最佳性能，所有方法都使用计算机浮点单元中的历程。
        StrictMath确保在所有平台上都得到相同结果。
    4.	Math类提供了Math.*Exact的方法，计算溢出会产生异常。

### 3.5.3 数值类型之间转换

### 3.5.4 强制类型转换
1.	强制类型转换：可能损失信息的转换

### 3.5.5 结合赋值运算符
### 3.5.6 自增与自减运算符
### 3.5.7 关系和boolean运算符
### 3.5.8 位运算符

    >>：符号位填充高位
    >>>：0填充高位，不存在<<<
    
    
### 3.5.9 括号与运算级别

## 3.6 字符串
1.	Java字符串是Unicode字符序列。
2.	

### 3.6.1 子串
### 3.6.2 拼接
### 3.6.3 不可变字符串
### 3.6.4 检测字符串是否相等
### 3.6.5 空串与null串
### 3.6.6 String API
