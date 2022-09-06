# patika-dev
Proje 1

[22,27,16,2,18,6] -> Insertion Sort

    Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
    Big-O gösterimini yazınız.
    Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
    Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.

1- insertion sort aşamaları

22,27,16,2,18,6
 16,22,27,2,18,6
 2,16,22,27,18,6
 2,16,18,22,27,6
 2,6,16,18,22,27


2- Big O gösterimi
sıralamayı yapabilmek için iç içe 2 döngü kullanmak gerekir. bu da her sayının tek tek bütün elemanlarla karşılaştırılması anlamına gelir.
O(N)*O(N) işlem yapılır. Sonuç olarak O(N^2).

3-time complexity
best case O(N)
mid case O(N^2)
worst case O(N^2)

4-Dizi sıralandıktan sonra 18 ortada olduğu için mid case kapsamına girer.


