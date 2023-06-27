import com.example.recipeapplication.Data.Food
import com.example.recipeapplication.R

object DataProvider {

    val foodList = listOf(
        Food(
            id = 1,
            title = "Chicken Skewers",
            price =1500,
            recipe = "INSTRUCTIONS\n" +
                    " 1. Place the chicken pieces in the large bowl and add the rest of the ingredients. Mix everything well. Cover, and refrigerate for between 2 to 24 hours to let it marinate. mixing the ingredients together \n" +
                    "2. Preheat the grill to medium-high heat. Arrange the chicken and peppers onto the skewers. placing the chicken and bell peppers on skewers\n" +
                    " 3. Oil the grilling grate. Cook for about 7 minutes on each side, until the chicken is well done.",
            foodimageid = R.drawable.chickenskewers,
        ),

        Food(
            id = 2,
            title = "Baked Chicken",
            price = 2000,
            recipe = "Preheat oven to 425°F | 220°C (standard ovens) or 390°F | 200°C (fan forced or convection ovens).\n" +
                    "Using a meat mallet or rolling pin, pound each chicken breast to 0.8-inch | 2cm at the thickest part. Make sure your fillets are all the same thickness to ensure even cooking.\n" +
                    "Combine sugar, paprika, oregano, salt, powders, pepper and chili (if using).\n" +
                    "Line a baking pan with aluminnium foil (or parchment/baking paper). Transfer chicken to the pan and toss chicken in the seasoning. Drizzle with the oil and rub seasoning all over to evenly coat. \n" +
                    "Bake chicken in preheated oven for 16-18 minutes, or until internal temperature is 165°F (75°C) using a meat thermometer. It should be golden with crisp edges.*\n" +
                    "Remove parchment paper. Broil (grill) on high heat during the last 2-3 minutes of cooking until golden and crisp.\n" +
                    "Remove pan from oven, transfer chicken to serving plates and let rest for 5 minutes before serving.\n" +
                    "OPTIONAL STEP: While chicken is in the oven, melt butter in a small skillet. Sauté garlic until fragrant (30 seconds), and remove pan from heat. Stir in parsley, then pour butter mixture into pan juices, stirring well to combine all of the flavours together.\n" +
                    "To serve, drizzle pan juices over the chicken and garnish with freshly chopped parsley..",
            foodimageid = R.drawable.bakedchicken,
        ),
        Food(
            id = 3,
            title = "Lasagna",
            price = 1000,
            recipe = "Start by making the sauce with ground beef, bell peppers, onions, and a combo of tomato sauce, tomato paste, and crushed tomatoes. The three kinds of tomatoes gives the sauce great depth of flavor.\n" +
                    "Let this simmer while you boil the noodles and get the cheeses ready. We're using ricotta, shredded mozzarella, and parmesan -- like the mix of tomatoes, this 3-cheese blend gives the lasagna great flavor!\n" +
                    "From there, it's just an assembly job. A cup of meat sauce, a layer of noodles, more sauce, followed by a layer of cheese. Repeat until you have three layers and have used up all the ingredients.\n" +
                    "Bake until bubbly and you're ready to eat!\n",
            foodimageid = R.drawable.lasagna,
        ),
        Food(
            id = 4,
            title = "Pasta",
            price = 1200,
            recipe = "Preheat the oven to 425 degrees F.\n" +
                    "Heat the olive oil in a large skillet over medium-high heat. Add the ground beef, 2 teaspoons salt and a few grinds of pepper and cook, breaking it up with a wooden spoon and stirring occasionally, until the beef is browned and no longer pink in the middle, 5 to 6 minutes. Pour in the marinara sauce and bring to a simmer. Lower the heat to medium and continue to simmer until slightly reduced, 5 to 6 minutes. Add the balsamic vinegar and butter and stir until the butter is melted.\n" +
                    "Meanwhile, combine the ricotta, Parmesan, egg, 1 cup of the mozzarella, 1 teaspoon salt and a few grinds of pepper in a medium bowl.\n" +
                    "Spoon 1/2 cup of the sauce onto the bottom of a 9-by-13-inch baking dish. Lay 3 of the lasagna noodles over the sauce. Spread a third of the cheese mixture over the noodles, then spread a third of the remaining sauce over top. Repeat 2 more times, then lay the last 3 noodles on top. Sprinkle with the remaining 1 cup mozzarella.\n" +
                    "Bake until the noodles are softened, the cheese on top is melted and turning brown in some spots and the sauce is bubbling around the edges, about 30 minutes. Let cool for 5 minutes before slicing and serving",
            foodimageid = R.drawable.pennepasta,
        ),
        Food(
            id = 5,
            title = "Pilau",
            price = 900,
            recipe= "Toast and blend the pilau masala: In a medium saucepan over medium heat. \n" +
                    "Brown the onions by frying it in oil until it caramelizes. This should take about 10 to 15 minutes. Stir in the Garlic, ginger and serrano pepper.\n" +
                    "Add the meat stock cubes, pilau masala, cilantro, bay leaves, and salt to taste and brown the meat for about \n" +
                    "Stir in the tomatoes and cook till it dissolves. Then stir in the potatoes.\n" +
                    "Add water and bring everything to a rolling boil and leave the potatoes to cook for about 10 minutes.\n" +
                    "Stir in the rice then cover tightly. You can use an aluminum foil to cover it first, this will help keep the steam in. Then place the lid over it and leave to cook on a low heat for 20 minutes until the liquid has been absorbed.\n" +
                    " Serve hot! You can sprinkle the rice pilaf with some chopped cilantro, then fluff with a fork. Enjoy.",
            foodimageid = R.drawable.pilau,
        ),

        Food(
            id = 6,
            title = "Cooked Rice",
            price = 950,
            recipe= "Heat oil in a large skillet over medium-high heat. Spread rice in a flat layer in hot oil; cook until crispy on the bottom, 2 to 3 minutes.\n" +
                    "\n" +
                    "Stir egg into rice until scrambled, about 2 minutes more. Sprinkle green onions on top and season with soy sauce.",
            foodimageid = R.drawable.rice,
        ),
        Food(
            id = 7,
            title = "Sausages",
            price = 500,
            recipe = "METHOD\n" +
                    "1.Heat 2 tbs oil in large saucepan over medium heat. Add onion and celery, and cook, stirring, for 5 minutes or until softened. Stir through garlic and cook for 1 minute or until fragrant.\n" +
                    "2.Add mortadella and sausage, and cook, breaking sausage up with a wooden spoon, for 10 minutes or until browned all over. Add sage and white wine, and simmer for 3 minutes or until reduced by half.\n" +
                    "3.Add sugo, stock and bay leaf, and simmer for 20 minutes or until thick and reduced. Season to taste.\n" +
                    "4.Cook pasta according to packet instructions. Drain and toss through sauce.\n" +
                    "5.Heat remaining 1/3 cup (80ml) oil in a frypan over medium-high heat. Add extra sage and cook for 1 minute or until crisp and bright. Remove using a slotted spoon and drain on paper towel.\n" +
                    "6.Sprinkle with fried sage and parmesan.",
            foodimageid = R.drawable.sausage,
        ),
    )
}