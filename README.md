# iFace-Code-Smells:
-> Solucionando a Large class: Desfazendo a classe Interaction, divindo em outras classes criadas relacionadas aos amigos, comunidades e mensagens que a classe Interaction lidava.
-> Solucionando a Lazy class: Deletando as classes CommunityOwner e Add_Friends que estavam somente existindo e não estavam sendo funcionais.
-> Solucionando o Alternative Classes with Different Interfaces e Refused Bequest: A classe Create_edit herdava a classe Create fazendo o mesmo, porém, com mais outros métodos, juntei as duas numa só classe.
-> Solucionando a Middle Man e Lazy class: Apagando a classe Feed que fazia apenas uma ação que era relacionada às classes Messages e Friends, e passando os métodos que estavam nela para a classe Messages.
-> Solucionando a Large class : Diminuindo o número de objetos que estavam na classe Main através da eliminação de outras classes, movendo métodos.
-> Solucionando o Divergent Change e Shotgun Surgery: Por ter muitos objetos na classe Main e classes interligadas, ao fazer uma modificação eu tinha que modificar em vários outros lugares, ao diminuir o número de objetos e separar classes isso foi resolvido.
-> Solucionando o Data class: Criando operações em alguns métodos da classe Create_Edit para não ser apenas uma classe de getters and setters.
-> Solucionando o Switch Statements: Criando métodos em suas próprias classes para evitar criá-los na classe Main e ficar uma sequência muito grande e suja de If's Else.
