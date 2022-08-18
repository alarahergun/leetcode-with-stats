class Solution {
    public static boolean validMountainArray(int[] arr) {
        boolean increase = false;
        boolean decrease = false;
        int value = arr[0];

        for(int i=1; i<arr.length; i++) {

            // in the beginning it has to increase so if it fails we stop
            if(i==1) {
                if(arr[i]>value) {
                    increase = true;
                    value = arr[i];
                } else {
                    return false;
                }
            } else {
                if(increase) {
                    if (arr[i] > value) {
                        value = arr[i];
                    } else {
                        if (arr[i] == value) {
                            return false;
                        } else {
                            increase = false;
                            decrease = true;
                            value = arr[i];
                        }
                    }
                } else {
                    if (decrease) {
                        if (arr[i] >= value) {
                            return false;
                        } else {
                            value = arr[i];
                        }
                    }
                }
            }
        }
        
        if(!decrease){
            return false;
        }

        return true;
    }
}  