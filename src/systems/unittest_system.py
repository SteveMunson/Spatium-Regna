import unittest
from system import System


class TestSystem(unittest.TestCase):

    def test_instance(self):
        objectName = System()
        self.assertIsInstance(objectName, System, 'Not an instance')

#    def test_negative(self):
##        self.assertEqual(abs(-10), 10)
#        self.assertEqual(abs(-6.28), 6.28)

#    def test_zero(self):
#        self.assertEqual(abs(0), 0)


if __name__ == '__main__':
    unittest.main()