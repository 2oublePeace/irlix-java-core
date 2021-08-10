# Практика по Java Core 
# Этап 1
## Задача 1:
Реализовать метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые). Во всех остальных случаях метод должен возвращать false. Cоставить формулу с использованием булевых операторов.
### Пример:
| Sample 1                                | Sample 2                            | Sample 3                              |
|-----------------------------------------|-------------------------------------|---------------------------------------|
| Sample Input 1: false false false false | Sample Input 2: true true true true | Sample Input 3: false false true true |
| Sample Output 1: false                  | Sample Output 2: false              | Sample Output 3: true                 |

## Задача 2:
Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года) до заданного года включительно. На самом деле Григорианский календарь был введен значительно позже, но здесь для упрощения мы распространяем его действие на всю нашу эру.
В программу всегда подается положительный номер года. Предполагается решение без циклов. Вам надо придумать и записать несложную формулу, использующую только арифметические операторы.
### Пример:
| Sample 1           | Sample 2           | Sample 3            |
|--------------------|--------------------|---------------------|
| Sample Input 1: 1  | Sample Input 2: 4  | Sample Input 3: 100 |
| Sample Output 1: 0 | Sample Output 2: 1 | Sample Output 3: 24 |

## Задача 3:
Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное. Данная задача актуальна, например, при работе с битовыми полями.
Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
### Пример:
| Sample 1             |
|----------------------|
| Sample Input 1: 34 5 |
| Sample Output 1: 50  |

## Задача 4:
Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a
### Пример:
| Sample 1           | Sample 2           |
|--------------------|--------------------|
| Sample Input 1: 32 | Sample Input 2: 29 |
| Sample Output 1: | | Sample Output 2: y |

## Задача 5:
Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
Решать можно разными способами:
* воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
* применив пару трюков из двоичной арифметики;
* написав решение "в лоб" с циклом и условными операторами

### Пример:
| Sample 1               | Sample 2              | Sample 3              |
|------------------------|-----------------------|-----------------------|
| Sample Input 1: 0      | Sample Input 2: 1     | Sample Input 3: -2    |
| Sample Output 1: false | Sample Output 2: true | Sample Output 3: true |

## Задача 6:
Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр символов должны игнорироваться. Гарантируется, что в метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания). Т.е. русских, китайских и прочих экзотических символов в строке не будет.
### Пример:
| Sample 1                         |
|----------------------------------|
| Sample Input 1: Madam, I'm Adam! |
| Sample Output 1: 50              |

# Этап 2
## Задача 7:
Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые). Во всех остальных случаях метод должен возвращать false. Cоставьте формулу с использованием булевых операторов
### Пример:
| Sample 1               | Sample 2              |
|------------------------|-----------------------|
| Sample Input 1: 1      | Sample Input 2: 3     | 
| Sample Output 1: 1     | Sample Output 2: 6    |

## Задача 8:
Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.
Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.

**public static** int[] **mergeArrays**(int[] a1, int[] a2) {...}
### Пример:
Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив {0, 1, 2, 2, 3}

## Задача 9:
Описание задачи можно взять тут:

https://docs.google.com/document/d/1GR6q6pZWemmIclcfF_QTf0pq6mb4ZkZwA4jsqkztNes/edit?usp=sharing

## Задача 10:
Описание задачи можно взять тут:

https://docs.google.com/document/d/1xT-L5IUNzd4N6cZfDvgcaAKzs2Th4AjuFWx0L8JkVVs/edit?usp=sharing

## Задача 11:
Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals() сравнивал экземпляры ComplexNumber по содержимому полей re и im, а hashCode() был бы согласованным с реализацией equals(). Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет.

### Пример:
ComplexNumber a = new ComplexNumber(1, 1);
ComplexNumber b = new ComplexNumber(1, 1);
// a.equals(b) must return true
// a.hashCode() must be equal to b.hashCode()

## Задача 12:
Описание задачи можно взять тут:

https://docs.google.com/document/d/18jJ-jjMBqpItnhB0HHHwG0km_2W7AnVBJmoSdmJT2EY/edit?usp=sharing

## Задача 13:
Реализуйте метод sqrt(), вычисляющий квадратный корень числа. В отличие от Math.sqrt(), это метод при передаче отрицательного параметра должен бросать исключение java.lang.IllegalArgumentException с сообщением "Expected non-negative number, got ?", где вместо вопросика будет подставлено фактически переданное в метод число.

## Задача 15:
Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов и не запрещающий элементам принимать значение null.
Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический фабричный метод of(). Конструктор должен быть закрытым (private).
С корректно реализованным классом Pair должен компилироваться и успешно работать следующий код:

### Пример:
Pair<Integer, String> pair = Pair.of(1, "hello");

Integer i = pair.getFirst(); // 1

String s = pair.getSecond(); // "hello"

Pair<Integer, String> pair2 = Pair.of(1, "hello");

boolean mustBeTrue = pair.equals(pair2); // true!

boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

# Этап 3
## Задача 1:
Реализуйте метод, вычисляющий симметрическую разность двух множеств.

Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.
### Пример:
Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.

## Задача 2:
Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами, затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность в обратном порядке в System.out.

Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.
### Пример:
| Sample 1                         |
|----------------------------------|
| Sample Input 1: 1 2 3 4 5 6 7    |
| Sample Output 1: 6 4 2           |

## Задача 3:
Постройте и распечатайте частотный словарь букв русского (или английского) алфавита. Опустим проблему выбора и анализа корпуса языка, достаточно будет взять текст небольшой длины).

## Задача 4:
Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

## Задача 5:
Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. Напишите еще один метод, который выбирает из заполненного списка элемент наугад 10000 раз. Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.

## Задача 6:
Напишите метод, который получает на вход Map<K, V> и возвращает Map, где ключи и значения поменяны местами. Так как значения могут совпадать, то тип значения в Map будет уже не K, а Collection<K>. Полный тип возвращаемого значения:

**Map<V, Collection<K>>**
