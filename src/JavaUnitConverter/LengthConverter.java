package JavaUnitConverter;

public class LengthConverter<T> extends BaseConverter<LengthUnit>{

    @Override
    public double convert(LengthUnit l1, LengthUnit l2){
        if(l1.name().equals(LengthUnit.METER.name())){
            if(l2.name().equals(LengthUnit.KILOMETER.name())){
                return l1.getNum() / 1000;
            } else if(l2.name().equals(LengthUnit.MILE.name())){
                return l1.getNum() / 1609.34;
            }
        } else if(l1.name().equals(LengthUnit.KILOMETER.name())){
            if(l2.name().equals(LengthUnit.METER.name())){
                return l1.getNum() * 1000;
            } else if(l2.name().equals(LengthUnit.MILE.name())){
                return l1.getNum() / 1.609;
            }
        } else if(l1.name().equals(LengthUnit.MILE.name())){
            if(l2.name().equals(LengthUnit.KILOMETER.name())){
                return l1.getNum() * 1.609;
            } else if(l2.name().equals(LengthUnit.METER.name())){
                return l1.getNum() * 1609.34;
            }
        }
        return l1.getNum();
    }
}
