package S3Workshop_4;

import S3Tutorial4.Calculator;
import S3Workshop2.W2Task4;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TestingTest {
    @Test
    void testFahrenheitToCelsius() {
        W4Task1 a = new W4Task1();
        assertEquals(0.0, a.conCel(32));
        assertEquals(212, a.conFa(100));
    }

    @Test
    void testCalculotor() {
        W4Task2 b = new W4Task2();
        assertEquals(5, b.add(2,3));
    }


    @Test
    void testBank() {
        W4Task3 c = new W4Task3();
        c.deposit(100.00);
        assertEquals(100.0, c.getBalance());

        c.withdraw(50.0);
        assertEquals(50.0, c.getBalance());

        assertFalse(c.withdraw(60.0));
        assertEquals(50.0, c.getBalance());
    }


    @Test
    void testEven() {
        W4Task4 d = new W4Task4();
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, W4Task4.getEvenNumbers(input));
    }

    @Test
    public void testProduct() {
        W4Task5 product = new W4Task5("Laptop", 1000.0, 2);

        assertAll("Product Assertions",
                () -> assertNotNull(product.getName()),
                () -> assertTrue(product.getPrice() > 0),
                () -> assertAll("isAffordable assertions",
                        () -> assertTrue(product.isAffordable(3000)),
                        () -> assertFalse(product.isAffordable(1500))
                )
        );
    }

    @Test
    public void testIsProductAvailable() {
        W4Task6 inventory = new W4Task6();
        inventory.addProduct("Laptop", 10);
        inventory.addProduct("Phone", 5);

        assertTrue(inventory.isProductAvailable("Laptop", 5));
        assertFalse(inventory.isProductAvailable("Phone", 6));
        assertFalse(inventory.isProductAvailable("Tablet", 1));
    }

    @Test
    public void testSendEmail_ValidEmail() {
        W4Task7 service = new W4Task7();
        assertTrue(service.sendEmail("test@example.com"));
        assertFalse(service.sendEmail("invalid.com"));
    }


    @Test
    public void teststudent() {
        W4Task8 stu = new W4Task8();
        assertTrue(stu.enorllStudent("rojan", "computer"));
    }


    @Test
    public void testmani() {
        W4Task9 manipulator = new W4Task9();
            assertAll("StringManipulator methods",
                    () -> assertEquals("olleh", manipulator.toreverse("hello")),
                    () -> assertEquals("HELLO", manipulator.toUppercase("hello")),
                    () -> assertTrue(manipulator.isPalin("madam")),
                    () -> assertFalse(manipulator.isPalin("hello")),
                    () -> assertEquals(2, manipulator.countVowel("hello")),
                    () -> assertEquals(0, manipulator.countVowel("bcdfg"))
            );
    }

    private W4Task10 calc;

        @BeforeAll
        static void setupClass() {
            System.out.println("Global setup...");
        }

        @AfterAll
        static void tearDownClass() {
            System.out.println("Global cleanup...");
        }

        @BeforeEach
        void setup() {
            calc = new W4Task10();
            System.out.println("Setup Calculator...");
        }

        @AfterEach
        void tearDown() {
            System.out.println("Test cleanup...");
        }

        @Test
        void testAddition() {
            assertEquals(5, calc.add(2, 3));
        }

        @Test
        void testSubtraction() {
            assertEquals(1, calc.subtract(3, 2));
        }

        @Test
        void testMultiplication() {
            assertEquals(6, calc.multiply(2, 3));
        }

        @Test
        void testDivision() {
            assertEquals(2.0, calc.divide(6, 3));
        }

        @Test
        void testDivisionByZero() {
            assertThrows(ArithmeticException.class, () -> calc.divide(6, 0));
        }

    }

