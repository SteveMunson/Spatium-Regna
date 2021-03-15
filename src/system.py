#!/usr/bin/env python

from faker import Faker
import random
from planet import Planet

class System:
    def __init__(self):
        self.systemDensity = 1 # percent chance of an additional planet per system
        self.planets = list()
        faker = Faker(['it_IT', 'en_US', 'fr_FR', 'en_GB', 'de_DE', 'ro_RO', 'sv_SE', 'de_AT'])
        self.name = faker.last_name()
        self.numbering = 1
        self.planets.append(Planet(self.name + ' '+ str(self.numbering)))
        self.numbering = self.numbering +1

        while(random.randrange(100)<=self.systemDensity):
            self.planets.append(Planet(self.name + ' '+ str(self.numbering)))
            self.numbering = self.numbering +1

    def getName(self):
        return self.name

    def getPlanets(self):
        return self.planets