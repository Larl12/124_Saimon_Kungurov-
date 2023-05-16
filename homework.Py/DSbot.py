import os
import discord
from random import randint
from discord.ext import commands

a = list(range(1, 101))


bot = commands.Bot(command_prefix="!", intents=discord.Intents.all())


@bot.event
async def on_ready():
    print(f"{bot.user} has connected to Discord!")


@bot.command(name='game')
async def game(message):
    if message.author != bot.user:
        await message.channel.send('Придумайте число от 1 до 100')
        answ = ''
        tmp = [1, 100]
        count = 0
        rnd = randint(1, 100)
        while answ.lower() != 'да':
            await message.channel.send(f'Может быть это {rnd}? (Да/Нет): ')
            answ = await bot.wait_for('message')
            answ = answ.content
            count += 1
            if answ.lower() == 'нет':
                await message.channel.send('Больше или меньше? ')
                ans = await bot.wait_for('message')
                ans = ans.content
                if ans.lower() == 'больше':
                    tmp[0] = rnd
                    rnd = (tmp[0] + tmp[1]) // 2
                elif ans.lower() == 'меньше':
                    tmp[1] = rnd
                    rnd = (tmp[0] + tmp[1]) // 2
                else:
                    await message.channel.send('Нет такой команды')
            elif answ.lower() != 'нет' and answ.lower() != 'да':
                await message.channel.send('Нет такой команды')
        await message.channel.send(f'Ура! Угадал с {count} попыток!')


bot.run('MTEwNzkzNTY3NTk3NTczNzQxNA.G-LoiV._mpTd_yZ175gkKMA6KCqdMpXk98f3wt5PKYBas')