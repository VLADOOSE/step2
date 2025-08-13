package JavaUnitConverter;

public class WeightConverter<T> extends BaseConverter<WeightUnit> {
    @Override
    public double convert(WeightUnit l1, WeightUnit l2){
        if(l1.name().equals(WeightUnit.KILOGRAM.name())){
            if(l2.name().equals(WeightUnit.POUND.name())){
                return l1.getNum() * 2.205;
            } else if(l2.name().equals(WeightUnit.OUNCE.name())){
                return l1.getNum() * 35.274;
            }
        } else if(l1.name().equals(WeightUnit.POUND.name())){
            if(l2.name().equals(WeightUnit.KILOGRAM.name())){
                return l1.getNum() / 2.205;
            } else if(l2.name().equals(WeightUnit.OUNCE.name())){
                return l1.getNum() / 0.0625;
            }
        } else if(l1.name().equals(WeightUnit.OUNCE.name())){
            if(l2.name().equals(WeightUnit.KILOGRAM.name())){
                return l1.getNum() / 35.274;
            } else if(l2.name().equals(WeightUnit.POUND.name())){
                return l1.getNum() / 16;
            }
        }
        return l1.getNum();
    }
}
