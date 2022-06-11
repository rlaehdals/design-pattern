# Strategy Pattern (전략 패턴)

스태리티지 패턴을 이용해서 파일 속성을 다양한 형태로 비교해서 정렬할 수 있는 프로그램을 만드세요

주어진 Main, Sorter, Comparable을 이용



### 예상 출력

원본 리스트
Name: CompareModifiedDate
Type: java
Size: 120
ModifiedDate: Sun Sep 13 21:59:00 KST 2020
Name: CompareFileType
Type: java
Size: 80
ModifiedDate: Sat Sep 12 21:59:00 KST 2020
Name: CompareFileName
Type: class
Size: 150
ModifiedDate: Sun Sep 13 16:54:00 KST 2020
Name: Main
Type: java
Size: 85
ModifiedDate: Sat Sep 12 21:54:00 KST 2020
Name: CompareSize
Type: Class
Size: 100
ModifiedDate: Sun Sep 13 11:59:00 KST 2020


파일 이름으로 정렬된 리스트
Name: CompareFileName
Type: class
Size: 150
ModifiedDate: Sun Sep 13 16:54:00 KST 2020
Name: CompareFileType
Type: java
Size: 80
ModifiedDate: Sat Sep 12 21:59:00 KST 2020
Name: CompareModifiedDate
Type: java
Size: 120
ModifiedDate: Sun Sep 13 21:59:00 KST 2020
Name: CompareSize
Type: Class
Size: 100
ModifiedDate: Sun Sep 13 11:59:00 KST 2020
Name: Main
Type: java
Size: 85
ModifiedDate: Sat Sep 12 21:54:00 KST 2020


파일 종류로 정렬된 리스트
Name: CompareSize
Type: Class
Size: 100
ModifiedDate: Sun Sep 13 11:59:00 KST 2020
Name: CompareFileName
Type: class
Size: 150
ModifiedDate: Sun Sep 13 16:54:00 KST 2020
Name: CompareFileType
Type: java
Size: 80
ModifiedDate: Sat Sep 12 21:59:00 KST 2020
Name: CompareModifiedDate
Type: java
Size: 120
ModifiedDate: Sun Sep 13 21:59:00 KST 2020
Name: Main
Type: java
Size: 85
ModifiedDate: Sat Sep 12 21:54:00 KST 2020


파일 크기로 정렬된 리스트
Name: CompareFileType
Type: java
Size: 80
ModifiedDate: Sat Sep 12 21:59:00 KST 2020
Name: Main
Type: java
Size: 85
ModifiedDate: Sat Sep 12 21:54:00 KST 2020
Name: CompareSize
Type: Class
Size: 100
ModifiedDate: Sun Sep 13 11:59:00 KST 2020
Name: CompareModifiedDate
Type: java
Size: 120
ModifiedDate: Sun Sep 13 21:59:00 KST 2020
Name: CompareFileName
Type: class
Size: 150
ModifiedDate: Sun Sep 13 16:54:00 KST 2020

파일 수정 시간으로 정렬된 리스트
Name: Main
Type: java
Size: 85
ModifiedDate: Sat Sep 12 21:54:00 KST 2020
Name: CompareFileType
Type: java
Size: 80
ModifiedDate: Sat Sep 12 21:59:00 KST 2020
Name: CompareSize
Type: Class
Size: 100
ModifiedDate: Sun Sep 13 11:59:00 KST 2020
Name: CompareFileName
Type: class
Size: 150
ModifiedDate: Sun Sep 13 16:54:00 KST 2020
Name: CompareModifiedDate
Type: java
Size: 120
ModifiedDate: Sun Sep 13 21:59:00 KS