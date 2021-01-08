def insertion_sort(values):
    for i in range(1,len(values)):
        key = values[i]
        holeposition = i

        while holeposition>0 and values[holeposition-1]>key :
            values[holeposition] = values[holeposition-1]
            holeposition = holeposition -1

        values[holeposition] = key

    print(values)
    

insertion_sort([2,3,7,1,6,3]) 