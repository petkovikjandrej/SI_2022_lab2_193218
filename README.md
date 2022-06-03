# Втора лабораториска вежба по Софтверско инженерство

## Андреј Петковиќ 193218

### Control Flow Graph
![CFG drawio](https://user-images.githubusercontent.com/101216266/171542407-0db17250-96c1-4aac-8695-858b03fb0902.png)

### Цикломатска комплексност

Цикломатската комплексност е 9. Истата е добиена со броење на самите региони во CFG.

### Тест случаи според критериумот Every Statement
    
    @Test
    void everyStatementTest(){
        IllegalArgumentException exception;

        exception = assertThrows(IllegalArgumentException.class, ()->SILab2.function(Collections.emptyList()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        exception = assertThrows(IllegalArgumentException.class, ()->SILab2.function(List.of("0", "#", "0", "#", "0")));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));

        assertEquals(List.of("1", "#", "2", "0", "3", "#", "1", "#", "#"), SILab2.function(List.of("0",  "#", "0", "0", "0", "#", "0", "#", "#" )));
    }
    
### Тест случаи според критериумот Every Branch
    
    @Test
    void everyBranchTest(){
        IllegalArgumentException exception;

        exception = assertThrows(IllegalArgumentException.class, ()->SILab2.function(Collections.emptyList()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        exception = assertThrows(IllegalArgumentException.class, ()->SILab2.function(List.of("0", "#", "0", "#", "0")));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));

        assertEquals(List.of("1", "#", "2", "0", "3", "#", "1", "#", "#"), SILab2.function(List.of("0",  "#", "0", "0", "0", "#", "0", "#", "#" )));
    }
    
### Објаснување на напишаните Unit Tests
Тест случаи според Every Statement и Every Branch

#### Тест 1
1. Првиот случај ги тестираме јазлите: 1, 2, 3, 25. Се проверува дали должината на листата е помала од 0 односно програмата треба да фрли исклучок поради внесување на празна листа како параметар.

#### Тест 2
2. Вториот случај ги тестираме јазлите: 1, 2, 4, 5, 6, 7, 25. Се проверува дали должината на листата е совршен квадрат односно квадратниот корен од должината на листата се помножува со истиот квадратен корен за да се квадрат, доколку не е се фрла исклучок дека со должината на листата не може да се конструира табла.

#### Тест 3
4. Третиот случај ги тестираме јазлите: 1, 2, 4, 5, 6, 8, 9.1, 9.2, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 9.3, 22, 23, 24, 25. Внесуваме листа со која ќе овозможиме нормален излез на програмата.

Со истите тестови може да се помине и Every Branch критериумот.
