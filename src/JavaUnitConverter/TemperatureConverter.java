package JavaUnitConverter;

public class TemperatureConverter<T> extends BaseConverter<TemperatureUnit>{
    @Override
    public double convert(TemperatureUnit l1, TemperatureUnit l2){
        if(l1.name().equals(TemperatureUnit.CELSIUS.name())){
            if(l2.name().equals(TemperatureUnit.FAHRENHEIT.name())){
                return l1.getNum() * 1.8 + 32;
            } else if(l2.name().equals(TemperatureUnit.KELVIN.name())){
                return l1.getNum() + 273;
            }
        } else if(l1.name().equals(TemperatureUnit.FAHRENHEIT.name())){
            if(l2.name().equals(TemperatureUnit.CELSIUS.name())){
                return (l1.getNum() - 32) / 1.8;
            } else if(l2.name().equals(TemperatureUnit.KELVIN.name())){
                return (l1.getNum() - 32) * 5 / 9 + 273;
            }
        } else if(l1.name().equals(TemperatureUnit.KELVIN.name())){
            if(l2.name().equals(TemperatureUnit.FAHRENHEIT.name())){
                return (l1.getNum() - 273) * 1.8 + 32;
            } else if(l2.name().equals(TemperatureUnit.CELSIUS.name())){
                return l1.getNum() - 273;
            }
        }
        return l1.getNum();
    }
}
