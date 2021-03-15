#!/usr/bin/env python

from faker import Faker
import random
from planet import Planet
from system import System

class Galaxy:

    def __init__(self):
        self.galaxySizeX = 10
        self.galaxySizeY = 10
        self.galaxyDensity = 10 # percent chance of a system per area
        self.systems = list()
        for x in range(self.galaxySizeX):
            for y in range(self.galaxySizeY):
                roll = random.randrange(100)
                if roll<=self.galaxyDensity:
                    system = System()
                    self.systems.append(system)
    
    def getSystems(self):
        return self.systems