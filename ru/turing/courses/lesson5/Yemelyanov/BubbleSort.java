package ru.turing.courses.lesson5.Yemelyanov;

public class BubbleSort implements Sort{
    @Override
    public int[] sort(int[] intArr) {
        for(int i = 0; i < intArr.length - 1; i++) {
            for (int j = 0; j < intArr.length - i - 1; j++) {
                if (intArr[j] > intArr[j + 1]){
                    int elem = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = elem;
                }
            }
        }

        return intArr;
    }

    @Override
    public String[] sort(String[] stringArr) {
        for (int i = 0; i < stringArr.length - 1; i++) {
            for (int j = 0; j < stringArr.length - i - 1; j++) {
                if (stringArr[j] == null || (stringArr[j + 1] != null && stringArr[j].length() > stringArr[j + 1].length())){
                    String elem = stringArr[j];
                    stringArr[j] = stringArr[j + 1];
                    stringArr[j + 1] = elem;
                }
            }
        }

        return stringArr;
    }

    @Override
    public Guitar[] sort(Guitar[] guitarArr, GuitarFieldEnum field) {

        switch (field){
            case ID_FIELD : {
                for (int i = 0; i < guitarArr.length - 1; i++) {
                    for (int j = 0; j < guitarArr.length - i - 1; j++) {
                        if(guitarArr[j].getId() > guitarArr[j + 1].getId()){
                            Guitar elem = guitarArr[j];
                            guitarArr[j] = guitarArr[j + 1];
                            guitarArr[j + 1] = elem;
                        }
                    }
                }
                break;
            }
            case NAME_FIELD : {
                for (int i = 0; i < guitarArr.length - 1; i++) {
                    for (int j = 0; j < guitarArr.length - i - 1; j++) {
                        if(guitarArr[j].getName() == null ||(guitarArr[j + 1].getName() != null &&
                                guitarArr[j].getName().length() > guitarArr[j + 1].getName().length())){
                            Guitar elem = guitarArr[j];
                            guitarArr[j] = guitarArr[j + 1];
                            guitarArr[j + 1] = elem;
                        }
                    }
                }
                break;
            }
            case PRICE_FIELD : {
                for (int i = 0; i < guitarArr.length - 1; i++) {
                    for (int j = 0; j < guitarArr.length - i - 1; j++) {
                        if(guitarArr[j].getPrice() > guitarArr[j + 1].getPrice()){
                            Guitar elem = guitarArr[j];
                            guitarArr[j] = guitarArr[j + 1];
                            guitarArr[j + 1] = elem;
                        }
                    }
                }
                break;
            }
        }

        return guitarArr;
    }
}



