int count = 0;
    Collections.sort(arr);
    for(int i=0;i<arr.size();i++){
        for(int j=i+1;j<arr.size();j++){
            if(Math.abs(arr.get(i)-arr.get(j)) == k){
                count++;
                continue;
            }
            if (Math.abs(arr.get(i)-arr.get(j)) > k) {
                    break;
                }
        }
    }
    return count;