from django.db import models
from django.urls import reverse

# Create your models here.
'''En este ejercicio tendrás que crear una aplicación en Django que almacene datos de directores de cine y luego se puedan ver sus películas, así como una descripción de las mismas.

Tienes que personalizar el admin de la aplicación y a su vez crear las vistas de cada una de las partes de la aplicación.'''


class Director(models.Model):
    first_name = models.CharField(max_length=100)
    last_name = models.CharField(max_length=100)
    date_of_birth = models.DateField(null=True, blank=True)
    date_of_death = models.DateField('Died', null=True, blank=True)

    def __str__(self):
        return f'{self.last_name}, {self.first_name}'

    def get_absolute_url(self):
        return reverse('director-detail', args=[str(self.id)])


class Movie(models.Model):
    title = models.CharField(max_length=200)
    director = models.ForeignKey(Director, on_delete=models.SET_NULL, null=True)
    description = models.TextField(max_length=1000, help_text="Ingrese una breve descripcion de la pelicula")

    def __str__(self):
        return self.title

    def get_absolute_url(self):
        return reverse('movie-detail', args[str(self.id)])
