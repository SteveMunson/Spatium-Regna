#!/usr/bin/env python

from galaxy import Galaxy

galaxy = Galaxy()

systems=galaxy.getSystems()
print(f'Number of systems: {len(systems)}')
for s in systems:
    print(f'System: {s.getName()}')
    for p in s.getPlanets():
        print(f'Planet: {p.getName()}')