package example.SpringCore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import example.SpringCore.beans.impl.FerrariRoma;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof FerrariRoma){
            ((FerrariRoma) bean).beforeInit();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof FerrariRoma){
            ((FerrariRoma) bean).afterInit();
        }

        return bean;
    }
}