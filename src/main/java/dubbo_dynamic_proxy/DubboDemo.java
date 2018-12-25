package dubbo_dynamic_proxy;

import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.spring.schema.DubboBeanDefinitionParser;
import com.alibaba.dubbo.rpc.Invoker;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;

public class DubboDemo {
    public static void main(String[] args) {
        BeanDefinition beanDefinition = new BeanDefinition() {
            @Override
            public void setParentName(String s) {

            }

            @Override
            public String getParentName() {
                return null;
            }

            @Override
            public void setBeanClassName(String s) {

            }

            @Override
            public String getBeanClassName() {
                return null;
            }

            @Override
            public void setScope(String s) {

            }

            @Override
            public String getScope() {
                return null;
            }

            @Override
            public void setLazyInit(boolean b) {

            }

            @Override
            public boolean isLazyInit() {
                return false;
            }

            @Override
            public void setDependsOn(String... strings) {

            }

            @Override
            public String[] getDependsOn() {
                return new String[0];
            }

            @Override
            public void setAutowireCandidate(boolean b) {

            }

            @Override
            public boolean isAutowireCandidate() {
                return false;
            }

            @Override
            public void setPrimary(boolean b) {

            }

            @Override
            public boolean isPrimary() {
                return false;
            }

            @Override
            public void setFactoryBeanName(String s) {

            }

            @Override
            public String getFactoryBeanName() {
                return null;
            }

            @Override
            public void setFactoryMethodName(String s) {

            }

            @Override
            public String getFactoryMethodName() {
                return null;
            }

            @Override
            public ConstructorArgumentValues getConstructorArgumentValues() {
                return null;
            }

            @Override
            public MutablePropertyValues getPropertyValues() {
                return null;
            }

            @Override
            public boolean isSingleton() {
                return false;
            }

            @Override
            public boolean isPrototype() {
                return false;
            }

            @Override
            public boolean isAbstract() {
                return false;
            }

            @Override
            public int getRole() {
                return 0;
            }

            @Override
            public String getDescription() {
                return null;
            }

            @Override
            public String getResourceDescription() {
                return null;
            }

            @Override
            public BeanDefinition getOriginatingBeanDefinition() {
                return null;
            }

            @Override
            public Object getSource() {
                return null;
            }

            @Override
            public void setAttribute(String s, Object o) {

            }

            @Override
            public Object getAttribute(String s) {
                return null;
            }

            @Override
            public Object removeAttribute(String s) {
                return null;
            }

            @Override
            public boolean hasAttribute(String s) {
                return false;
            }

            @Override
            public String[] attributeNames() {
                return new String[0];
            }
        };
//        DubboBeanDefinitionParser;
//        ReferenceConfig;
//        Invoker
    }
}
