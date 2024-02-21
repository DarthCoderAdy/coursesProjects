package GroovyExercise

def products = [
        [name: 'Product A', basePrice: 100.0],
        [name: 'Product B', basePrice: 150.0],
        [name: 'Product C', basePrice: 200.0]
]

def seasons = ['Spring', 'Summer', 'Fall', 'Winter']

def seasonalMultipliers = [
        'Spring': 1.05,
        'Summer': 1.10,
        'Fall': 1.03,
        // Winter multiplier is missing
]

def defaultPriceIncrease = 0.02 // 2% default increase for missing multiplier

// Candidate's code starts here

def seasonalProductPrices = [:]

for(product in products) {
    for(season in seasons) {
        def multiplier = seasonalMultipliers.get(season) != null ? seasonalMultipliers.get(season) : defaultPriceIncrease + 1
        def price = product.get('basePrice') * multiplier
        seasonalProductPrices.put(product.get('name') + "-" + season, price)
    }
} println(seasonalProductPrices)




def expectedPrices = [
        'Product A-Spring': 105.0,
        'Product A-Summer': 110.0,
        'Product A-Fall'  : 103.0,
        'Product A-Winter': 102.0,
        'Product B-Spring': 157.5,
        'Product B-Summer': 165.0,
        'Product B-Fall'  : 154.500,
        'Product B-Winter': 153.000,
        'Product C-Spring': 210.000,
        'Product C-Summer': 220.000,
        'Product C-Fall'  : 206.000,
        'Product C-Winter': 204.000
]
assert seasonalProductPrices == expectedPrices : "Calculation is incorrect. Expected: $expectedPrices, but was: $seasonalProductPrices"

