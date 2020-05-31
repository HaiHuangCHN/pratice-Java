package traffic.trafficLight;

import org.junit.Test;

public enum LightEnum {
    RED(1, "Please stop") {
        @Override
        public String localLight() {
            return "Stop and wait";
        }
    },
    GREEN(2, "Please go") {
        @Override
        public String localLight() {
            return "Go and keep right";
        }
    },
    YELLOW(3, "Please caution") {
        @Override
        public String localLight() {
            return "Caution and pass as soon as possible";
        }
    };

    private Integer code;
    private String description;

    /*
     * 1.Why there should be constructor? It is because when call enum, constructor
     * will be automatically called and pass the value to description
     * 
     * 2.enum's constructor should be "private" to avoid being invoked. "private"
     * can be omitted
     */

    LightEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getId() {
        return code;
    }

    public void setId(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String localLight();

    public void print() {
        String value = LightEnum.RED.localLight();
        System.out.println(value);
    }

    @Test
    public void testLightEnum() {
        print();
    }

}
