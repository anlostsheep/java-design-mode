package com.lostsheep.java.design.mode.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * <b><code>PrototypeCitation</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2020/4/10 11:26.
 *
 * @author dengzhen
 * @since java-design-mode 0.1.0
 */
@Slf4j
public class PrototypeCitation {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    static class Student implements Cloneable {
        private String name;
        private String info;
        private String college;


        void showInfo() {
            log.info("{},{},{}", name, info, college);
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            log.info("调用具体原型类 clone() 方法创建对象");
            return (Student) super.clone();
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("张三", "毕业了", "毕业于麻省理工");
        student.showInfo();
        
        Student cloneStu = (Student) student.clone();

        cloneStu.setName("李四");
        cloneStu.showInfo();
    }
}
