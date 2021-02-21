g.addV('service').property(id,'0').property('name','Customer Database').property('description','On-premise customer database').property('status','running').next()
g.addV('vpn').property(id,'1').property('name','Inter-site VPN').property('description','Connects on-premise services to AWS Account').property('status','running').next()
g.addV('service').property(id,'2').property('name','Proxy').property('description','Proxy traffic from AWS to on-premise account').property('status','running').next()
g.addV('service').property(id,'3').property('name','Account Service').property('description','Gets data from customer database for frontend').property('status','running').next()
g.addV('service').property(id,'4').property('name','Legacy Account Service').property('description','Old migrated customer service').property('status','running').next()
g.addV('service').property(id,'5').property('name','Payment Service').property('description','Provides payment services for customers').property('status','running').next()
g.addV('service').property(id,'6').property('name','Sales Service').property('description','Provides sales services to customers').property('status','running').next()

g.V('1').addE('dependency').to(g.V('0')).next()
g.V('2').addE('dependency').to(g.V('1')).next()
g.V('3').addE('dependency').to(g.V('2')).next()
g.V('3').addE('dependency').to(g.V('4')).next()
g.V('3').addE('dependency').to(g.V('5')).next()
g.V('4').addE('dependency').to(g.V('2')).next()
g.V('6').addE('dependency').to(g.V('2')).next()
g.V('6').addE('dependency').to(g.V('5')).next()


