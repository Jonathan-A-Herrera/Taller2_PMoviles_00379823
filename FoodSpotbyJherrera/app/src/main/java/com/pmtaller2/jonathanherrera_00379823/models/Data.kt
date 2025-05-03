import com.pmtaller2.jonathanherrera_00379823.models.Dish
import com.pmtaller2.jonathanherrera_00379823.models.Restaurant

val restaurants = listOf(
    Restaurant(
        id = 1,
        name = "La Parrilla Texana",
        description = "Un lugar acogedor con las mejores carnes asadas de la ciudad.",
        imageUrl = "https://plus.unsplash.com/premium_photo-1693262738354-b025d4005eb1?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8Y2FybmUlMjBhJTIwbGElMjBwYXJyaWxsYXxlbnwwfHwwfHx8MA%3D%3D",
        categories = listOf("Comida Rapida"),
        menu = listOf(
            Dish(101, "Churrasco Especial", "Carne de res jugosa con acompañamientos.", "https://www.pizzeriacalabria.com/wp-content/uploads/2020/07/churrasco.jpg"),
            Dish(102, "Pollo a la Parrilla", "Pollo marinado con especias locales.", "https://argentineasado.com/wp-content/uploads/2024/07/pollo-a-la-parrilla.jpg"),
            Dish(103, "Chorizo Artesanal", "Chorizo casero a la parrilla.", "https://i0.wp.com/carlsgrill.com/wp-content/uploads/2023/08/Chorizo-artesanal.jpg?fit=1500%2C1000&ssl=1")
        )
    ),
    Restaurant(
        id = 4,
        name = "El Asador Tradicional",
        description = "Las mejores carnes con técnicas tradicionales.",
        imageUrl = "https://queenslatino.com/wp-content/uploads/2022/07/Asado-argentino.png",
        categories = listOf("Comida Rapida"),
        menu = listOf(
            Dish(104, "Costillas BBQ", "Costillas de cerdo con salsa BBQ.", "https://cdn7.kiwilimon.com/recetaimagen/24882/960x640/20566.jpg.jpg"),
            Dish(105, "Entrecot Premium", "Corte de res con especias selectas.", "https://www.tasteatlas.com/images/dishes/b0bc28cca0ac414ba7443de63b344223.jpg")
        )
    ),
    Restaurant(
        id = 5,
        name = "Brasa y Sazón",
        description = "Parrilladas y cortes al estilo argentino.",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3lbqcFlySMQ4C5tO665fDA9MryPU7fMC1Ew&s",
        categories = listOf("Comida Rapida"),
        menu = listOf(
            Dish(106, "Bife de Chorizo", "Corte grueso de carne jugosa.", "https://www.kingarthur.com.ar/wp-content/uploads/2016/01/CARNE-bife-chorizo-21.jpg"),
            Dish(107, "Morcilla Criolla", "Morcilla artesanal a la parrilla.", "https://elpais.com/especiales-branded/la-despensa/2020/ingredientes-de-la-morcilla-sin-sangre/img/1589360875_961507_1589361487_noticia_normal.jpg")
        )
    ),

    Restaurant(
        id = 2,
        name = "Sazón de la Abuela",
        description = "Comida casera que te hará sentir como en casa.",
        imageUrl = "https://editorialtelevisa.brightspotcdn.com/dims4/default/bd4e78f/2147483647/strip/false/crop/900x506+0+47/resize/1200x675!/quality/90/?url=https%3A%2F%2Fk2-prod-editorial-televisa.s3.us-east-1.amazonaws.com%2Fbrightspot%2Fwp-content%2Fuploads%2F2021%2F06%2Fcomida-mexicana.jpg",
        categories = listOf("Comida Mexicana"),
        menu = listOf(
            Dish(201, "Sopa de Gallina", "Gallina campera con vegetales frescos.", "https://d1uz88p17r663j.cloudfront.net/original/917c81a711d85f14dc0f9560a2067ca3_Magg-dia-26300.jpg"),
            Dish(202, "Tamales de Elote", "Tamales dulces tradicionales.", "https://cdn7.kiwilimon.com/recetaimagen/14561/960x640/6941.jpg.jpg"),
            Dish(203, "Pastelitos de Carne", "Pasteles rellenos con carne y especias.", "https://www.196flavors.com/wp-content/uploads/2020/09/pastelitos-salvadorenos-1-FP.jpeg")
        )
    ),
    Restaurant(
        id = 6,
        name = "El Fogón Familiar",
        description = "Recetas caseras con sazón auténtico.",
        imageUrl = "https://www.brillante.es/wp-content/uploads/2024/08/Comida-casera-diaria-960x600.jpg",
        categories = listOf("Comida Mexicana"),
        menu = listOf(
            Dish(204, "Frijoles de la Casa", "Frijoles con chicharrón y plátanos.", "https://i.ytimg.com/vi/RNLTJX_xBgI/sddefault.jpg"),
            Dish(205, "Guiso de Res", "Carne de res con papas y zanahoria.", "https://images.aws.nestle.recipes/resized/66c9b575a38a40a208d75a6830f4f8aa_Maggi_-_Beef_Stew_1200_628.jpg")
        )
    ),
    Restaurant(
        id = 7,
        name = "Cocina Artesanal",
        description = "Platos tradicionales con ingredientes frescos.",
        imageUrl = "https://fmdiabetes.org/wp-content/uploads/2015/08/cocina-mexicana.jpg",
        categories = listOf("Comida Mexicana"),
        menu = listOf(
            Dish(206, "Arroz con Pollo", "Receta clásica con especias naturales.", "https://comedera.com/wp-content/uploads/sites/9/2023/08/Arroz-con-pollo-de-El-Salvador.jpg"),
            Dish(207, "Caldo de Res", "Sopa nutritiva con verduras frescas.", "https://www.larecetafacil.com/wp-content/uploads/2022/12/caldo-de-res-rojo-receta.jpg")
        )
    ),

    Restaurant(
        id = 3,
        name = "Delicias del Mar",
        description = "Especialidades en mariscos frescos y sabores costeros.",
        imageUrl = "https://www.goya.com/wp-content/uploads/2023/10/cazuela-de-mariscos_spanish-style-shellfish-stew.jpg",
        categories = listOf("Comida Saludable"),
        menu = listOf(
            Dish(301, "Camarones al Ajillo", "Camarones salteados con ajo y perejil.", "https://www.recetasnestlecam.com/sites/default/files/styles/recipe_detail_desktop_new/public/srh_recipes/a3edc0910e9c2e3c8a7670600542088a.jpg?itok=FNfc2KtE"),
            Dish(302, "Pescado Frito", "Pescado fresco con arroz y ensalada.", "https://comedera.com/wp-content/uploads/sites/9/2022/05/pescado-frito-con-tostones-y-ensalada.jpg"),
            Dish(303, "Ceviche Mixto", "Ceviche de pescado y mariscos.", "https://cdn0.recetasgratis.net/es/posts/8/7/2/ceviche_mixto_peruano_77278_orig.jpg")
        )
    ),
    Restaurant(
        id = 8,
        name = "Mariscos Gourmet",
        description = "Experiencia premium en comida de mar.",
        imageUrl = "https://i0.wp.com/cocineando.com/wp-content/uploads/2019/03/mariscos.jpg?fit=1400%2C800&ssl=1",
        categories = listOf("Comida Saludable"),
        menu = listOf(
            Dish(304, "Langosta al Ajillo", "Langosta con mantequilla y ajo.", "https://comedera.com/wp-content/uploads/sites/9/2022/04/Langosta-al-ajillo-shutterstock_1668087205.jpg"),
            Dish(305, "Pulpo a la Gallega", "Pulpo con papas y pimentón.", "https://recetasdecocina.elmundo.es/wp-content/uploads/2024/10/pulpo-a-la-gallega.jpg")
        )
    ),
    Restaurant(
        id = 9,
        name = "Sabores del Puerto",
        description = "Recetas frescas inspiradas en la costa.",
        imageUrl = "https://i.blogs.es/82cc26/img_0435/840_560.jpg",
        categories = listOf("Comida Saludable"),
        menu = listOf(
            Dish(306, "Filete de Pescado", "Pescado blanco con limón y hierbas.", "https://buenprovecho.hn/wp-content/uploads/2023/04/filete-a-la-plancha.jpg"),
            Dish(307, "Mejillones al Vino", "Mejillones en salsa de vino blanco.", "https://comedera.com/wp-content/uploads/sites/9/2022/05/mejillones-al-vino-1.jpg")
        )
    )
)