from django.contrib import admin
from .models import Director, Movie

# Register your models here.

# admin.site.register(Director)
# admin.site.register(Movie)


class MovieInline(admin.TabularInline):
    model = Movie
    extra = 0


@admin.register(Director)
class DirectorAdmin(admin.ModelAdmin):
    list_display = ('last_name', 'first_name', 'date_of_birth', 'date_of_death')
    fields = ['first_name', 'last_name', ('date_of_birth', 'date_of_death')]
    inlines = [MovieInline]


@admin.register(Movie)
class MovieAdmin(admin.ModelAdmin):
    list_display = ('title', 'director', 'description')
