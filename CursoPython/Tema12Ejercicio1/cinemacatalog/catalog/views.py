from django.shortcuts import render
from .models import Movie, Director

# Create your views here.


def index(request):
    num_movies = Movie.objects.count()
    num_directors = Director.objects.count()

    return render(
        request,
        'index.html',
        context={'num_movies': num_movies, 'num_directors': num_directors},
    )
