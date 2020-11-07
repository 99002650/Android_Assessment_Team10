package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import com.example.yummy.adapter.MethodViewAdapter;
import com.example.yummy.adapter.RecipeViewAdapter;
import com.example.yummy.adapter.RecycleViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        Intent intent = getIntent();
        String position = intent.getStringExtra("position");


        RecyclerView recyclerViewMethod = findViewById(R.id.recipeView);
        recyclerViewMethod.setHasFixedSize(true);
        recyclerViewMethod.setLayoutManager(new LinearLayoutManager(this));

        if(position.equals("1"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("A few saffron threads"),
                    new RecipeData("10-12 pistachios (peeled and sliced), blanched"),
                    new RecipeData("1 litre skimmed milk"),
                    new RecipeData("3 tbsp coarsely ground rice"),
                    new RecipeData("3/4 tbsp green cardamom powder"),
                    new RecipeData("3/4 tbsp green cardamom powder"),
                    new RecipeData("METHODS"),
                    new RecipeData("1. Bring the milk to a boil in a deep non-stick pan."),
                    new RecipeData("2. Lower the heat and simmer, stirring continuously, till it reduces by half.Add the ground rice, mixed with a little water, and stir well to prevent lumps from forming."),
                    new RecipeData("3. Bring the mixture to a boil. When it starts to thicken, lower the heat and simmer for a couple of minutes, stirring continuously."),
                    new RecipeData("4. Add the cardamom powder and saffron, and mix well.When the mixture attains a thick custard-like consistency, remove from heat and stir in the low-calorie sweetener."),
                    new RecipeData("5. Pour the mixture into 4 individual earthenware bowls while still warm. Sprinkle sliced pistachios and refrigerate for at least 2 hours.")
            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("2"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("2 Litre full fat milk"),
                    new RecipeData("120 gms rice"),
                    new RecipeData("40 gms grain sugar"),
                    new RecipeData("3-4 Rose water drops"),
                    new RecipeData("10 gms dried rose petals"),
                    new RecipeData("100 gms almonds"),
                    new RecipeData("25 gms almond slivers"),
                    new RecipeData("METHODS"),
                    new RecipeData("1. Soak the rice in water for about 20 minutes."),
                    new RecipeData("2. Heat milk in a heavy bottom pan. After a boil, reduce the heat and simmer till milk is reduced to half the original volume."),
                    new RecipeData("3. Add the soaked rice after draining the water and cook on low heat till rice is cooked well and the mix thickens."),
                    new RecipeData("4. Add chopped almonds and cook for further 15 mins on low heat till the kheer is thick and creamy, add sugar."),
                    new RecipeData("5. Set aside to cool. Once cool add rose water and mix. Refrigerate till serving"),
                    new RecipeData("6. Roast some almond slivers in an oven for 180 degrees for 5 minutes, until golden brown. Garnish with slivers and dried rose petals before serving.")
            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("3"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("7 eggs"),
                    new RecipeData("1 cucumber"),
                    new RecipeData("1 carrot"),
                    new RecipeData("1 bunch green onion"),
                    new RecipeData("1 pinch salt"),
                    new RecipeData("black pepper"),
                    new RecipeData("METHODS"),
                    new RecipeData("1. Chop all the ingredients(carrot, cucumber and green onion) into dice."),
                    new RecipeData("2. In a large bowl, crack eggs and stir nicely."),
                    new RecipeData("3. Mix the chopped ingredients into the bowl. Add salt and black pepper to taste."),
                    new RecipeData("4. A pan is heated with strong flame. Then, switch to low flame."),
                    new RecipeData("5. Pour the mixture nicely and spread the egg first. Then, take a spoon and scatter the ingredients on top.(just like rinse something and take the liquid out first)"),
                    new RecipeData("6. Switch to medium flame. Roll eggs till half carefully by using two spatulas."),
                    new RecipeData("7. Pour the remaining mixture into the pan. Repeat the rolling step."),
                    new RecipeData("8. Cool the egg role for a while before cut. Ready to serve. Eat best with soup.")
            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("4"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("1 Cup Wheat flour"),
                    new RecipeData("1/2 tsp Castor oil"),
                    new RecipeData("1 tsp Oil"),
                    new RecipeData(" 3 Tbsp Cow milk"),
                    new RecipeData("1-2 Medium Potatoes"),
                    new RecipeData("1/4 tsp Dry mango powder"),
                    new RecipeData(" 1/2 tsp Cumin powder, roasted"),
                    new RecipeData(" 1/4 tsp Coriander powder"),
                    new RecipeData(" 1/4 tsp Red chilli powder"),
                    new RecipeData(" 1/4 tsp Cumin seeds"),
                    new RecipeData("1 tsp Black pepper (freshly ground)"),
                    new RecipeData("A pinch of Asafoetida"),

                    new RecipeData("METHODS"),
                    new RecipeData("1. Mix wheat flour, milk and castor oil (water if required) and knead a soft dough. Cover it with wet muslin cloth and let it stand for 20 minutes."),
                    new RecipeData("2. Steam potatoes. Peel carefully and mash them."),
                    new RecipeData("3. Heat oil in a pan. When the oil is hot add cumin seeds. When it starts spluttering, add roasted cumin powder, red chilli powder, black pepper powder, dry coriander powder, dry mango powder and asafoetida. Cook for 15 seconds."),
                    new RecipeData("4. Add potatoes and rock salt and mix it properly and cook for 1 minute."),
                    new RecipeData("5. Remove the pan from flame. The stuffing for the samosas is ready."),
                    new RecipeData("6. Roll chapatti and stuff it with the mashed potato mixture. Fold it into triangular samosa like shape."),
                    new RecipeData("7. Bake these samosas at 160 C, till they are light brown in colour."),
                    new RecipeData("8. Serve hot.")

            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("5"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData(" 2 Cups Fresh breadcrumbs"),
                    new RecipeData("1/3 Cup Parmesan cheese, grated"),
                    new RecipeData("1 Tbsp Lemon rind, grated"),
                    new RecipeData(" 2 Tbsp Fresh Parsley leaves, finely chopped"),
                    new RecipeData("1 tsp Garlic powder"),
                    new RecipeData("1/2 Cup Plain flour"),
                    new RecipeData("1 Egg"),
                    new RecipeData("1 Tbsp Milk"),
                    new RecipeData("550 Gram Chicken breast supremes"),

                    new RecipeData("METHODS"),
                    new RecipeData("1. Combine breadcrumbs, parmesan, lemon rind, and parsley and garlic powder on a plate."),
                    new RecipeData("2. Season with salt and pepper. Place flour on a plate. Whisk egg and milk together in a shallow bowl."),
                    new RecipeData("3. Coat 1 piece of chicken in flour, shaking off excess. Dip in egg mixture. Coat in breadcrumb mixture. Place on a plate."),
                    new RecipeData("4. Repeat with remaining chicken, flour, egg mixture and breadcrumb mixture."),
                    new RecipeData("5. Heat oil in a frying pan over medium-high heat."),
                    new RecipeData("6. Cook chicken, in batches, for 4 to 5 minutes each side or until golden and cooked through. Transfer to a plate lined with paper towel to drain."),
                    new RecipeData("7. Serve with a Ranch Dip.")

            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("6"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData(" 20 gms++ carrot, julienne"),
                    new RecipeData(" 20 gms yellow and green zucchini"),
                    new RecipeData("20 gms bell pepper"),
                    new RecipeData(" 20 gms pok choy"),
                    new RecipeData(" 15 gms spinach"),
                    new RecipeData("20 gms chicken, julienne"),
                    new RecipeData("20 gms prawns"),
                    new RecipeData("300 gms jasmine rice"),
                    new RecipeData(" 10 ml soya sauce"),
                    new RecipeData("5 ml sesame oil"),
                    new RecipeData("2 gms pepper"),
                    new RecipeData("10 gms garlic"),
                    new RecipeData("5 gms ginger"),
                    new RecipeData("3 nos egg"),

                    new RecipeData("METHODS"),
                    new RecipeData("1. Heat oil, sauté ginger, add raw jasmine rice, sauté for 30 seconds, add 100 ml of chicken stock and cook it covered for 20 minutes."),
                    new RecipeData("2. Sauté all veggies (cut into Julienne), chicken and prawn separately with garlic, sesame oil and light soya, Crushed pepper."),
                    new RecipeData("3. Prepare the sauce by heating a wok with oil, add garlic, chilli paste and gochujang paste, add little chicken stock, and adjust seasoning as required."),
                    new RecipeData("4. Cook eggs, sunny side up."),
                    new RecipeData("5. Assemble by placing the rice in the stone bowl, topped with sautéed veg, chicken and prawns. Top with fried egg. Serve with gochujang sauce on side.")
            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("7"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("1 tsp Salt"),
                    new RecipeData("1 tsp Oil"),
                    new RecipeData("1 tsp Garlic paste"),
                    new RecipeData("1 tsp Ginger paste"),
                    new RecipeData("1/2 Cup Beans"),
                    new RecipeData("1/2 Cup Cabbage, chopped"),
                    new RecipeData("1/2 Cup Carrot, chopped"),
                    new RecipeData("1/2 Cup Spring onion, chopped"),
                    new RecipeData("1/2 Cup Capsicum, chopped"),
                    new RecipeData("2 Tbsp Soy sauce"),
                    new RecipeData("2 Tbsp Green chilli sauce"),
                    new RecipeData("1 Tbsp Tomato sauce"),

                    new RecipeData("METHODS"),
                    new RecipeData("1. Boil the noodles in a pan till it starts to simmer."),
                    new RecipeData("2. Add salt and some oil to the boiling noodles."),
                    new RecipeData("3. When the noodles start to e a little sticky, drain the excess water and wash them in cold water."),
                    new RecipeData("4. In another pan, heat about 3 teaspoon of oil."),
                    new RecipeData("5. Put ginger paste followed by garlic paste. Saute them well till golden brown."),
                    new RecipeData("6. Now add all the vegetables to the pan."),
                    new RecipeData("7. Saute them well and add soy sauce, green chilli sauce and tomato sauce."),
                    new RecipeData("8. Mix them well and now add the boiled noodles to them."),
                    new RecipeData("9. Mix them thoroughly with the vegetables.")

            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("8"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("500 gm paneer (Indian cottage cheese), cut into 1 1/2"),
                    new RecipeData("2 tsp garlic paste"),
                    new RecipeData(" 2 tsp ginger paste"),
                    new RecipeData("1 tsp powdered black pepper"),
                    new RecipeData(" 1 Tbsp salt to taste"),
                    new RecipeData(" 2 Tbsp coriander leaves, chopped"),
                    new RecipeData("Green chillies, chopped to taste"),
                    new RecipeData("1/4 cup yogurt"),
                    new RecipeData("1/4 cup white sesame seeds (Safed til), roasted"),
                    new RecipeData("Oil to brush the paneer, optional"),
                    new RecipeData("Lemon wedges, to garnish"),
                    new RecipeData("Onion rings, to garnish"),

                    new RecipeData("METHODS"),
                    new RecipeData("1 .Mix all the ingredients except the oil and garnishes and leave for 20-30 minutes at least."),
                    new RecipeData("2. Place the paneer on a drip pan and bake in the pre-heated oven for about 10mins."),
                    new RecipeData("3. Remove from oven, dab with oil and bake again for 10 minutes. Alternatively, you can grill on a griller or a barbecue pit. (The drippings should definitely have a means of escape, or else the paneer will get soggy)."),
                    new RecipeData("4. Serve hot, garnished with lemon and onion rings.")

            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData, DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("9"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("1 Bunch raw kale leaves"),
                    new RecipeData(" 1 cup canned chickpeas, boiled"),
                    new RecipeData("1 cup strawberries, sliced"),
                    new RecipeData("1/2 cup onion, chopped"),
                    new RecipeData("1 cup blueberries"),
                    new RecipeData("1/4 cup sunflower seeds (or seeds of your choice)"),
                    new RecipeData("1/3 cups water"),
                    new RecipeData("3 tbsp balsamic vinegar"),
                    new RecipeData("1 Garlic clove(finely minced)"),
                    new RecipeData(" 1 tbsp chia seeds"),
                    new RecipeData(" 1/4 tsp table salt"),
                    new RecipeData("METHODS"),
                    new RecipeData("1. First, prepare the salad dressing by tossing all the ingredients in a mixing bowl. Whisk all the ingredients together by hand using a spoon for a thinner consistency. Alternatively, pulse all ingredients in a blender for a thicker texture."),
                    new RecipeData("2. Keep the dressing mixture aside and it will naturally thicken as the chia seeds absorb water and swell up."),
                    new RecipeData("3. Wash, massage, and tear up the kale by hand into bite-sized pieces. Drain the boiled or canned chickpeas and add them to the bowl of shrunken and softened kale. Add onion, strawberries, and blueberries to the mix."),
                    new RecipeData("4. Toss the dressing into the salad mixture, and evenly coat all the ingredients. Sprinkle sunflower seeds over top.")
            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }


    }
}