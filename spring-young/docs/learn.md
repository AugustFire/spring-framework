# 目标
| 模块                | 单元               | 阅读覆盖率(要求60%+) | 备注 |
| ------------------- | ------------------ | -------------------- | ---- |
| ioc                 | refresh/config,    | 20%                  |      |
| bean life           | getBean            | 45%                  |      |
| circular dependency | cd                 | 45%                  |      |
| aop                 | aspect,advisor,aop | 40%                  |      |
| async               | advisor            | 50%                  |      |
| transcation         | ?                  | 0%                   |      |
| web(optional)       | ?                  | 0%                   |      |


# I.Bean的创建
```text
    读取bd    ->  修改bd    -> 创建Bean -> 属性注入  -> 执行初始化方法 -> 代理对象
```

# II BeanFactoryPostProcessor

# III.BeanPostProcessor
## 1.BeanPostProcessor(I)
```text
    #postProcessBeforeInitialization    初始化前
    #postProcessBeforeInitialization    Bean初始化后
```
### 1.1 ApplicationContextAwareProcessor(IC)
BeanPostProcessor的直接子类,在初始化前为实现Aware的实现了各类上下文对象
```java
	private void postProcessBeforeInitialization#invokeAwareInterfaces(Object bean) {
		if (bean instanceof Aware) {
			if (bean instanceof EnvironmentAware) {
				((EnvironmentAware) bean).setEnvironment(this.applicationContext.getEnvironment());
			}
			//...
	}
```

## 2.InstantiationAwareBeanPostProcessor(II)
```textmate
    #postProcessBeforeInstantiation     在实例化之前(压制默认的实例化方式)
    #postProcessAfterInstantiation      在实例化之后(默认返回true后继续后续操作,比如属性赋值)
```
## 3.CommonAnnotationBeanPostProcessor

## 4.AutowiredAnnotationBeanPostProcessor

## 5.RequiredAnnotationBeanPostProcessor

# IV Circular dependency
[circular dependency](https://www.cnblogs.com/daimzh/p/13256413.html#%E5%89%8D%E8%A8%80)