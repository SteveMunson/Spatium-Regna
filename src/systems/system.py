#!/usr/bin/env python

from faker import Faker

class System:

    faker = Faker(['it_IT', 'en_US', 'fr_FR', 'en_GB', 'de_DE'])

#for i in range(10):
#    print(faker.last_name())