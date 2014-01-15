 name: NarnaLinks
 version: 0.2
 description: A plugin by and for Narna, made to make it easier to spread server related links.
 author: AtomicLeak
 website: http://narna.me
 
 main: me.narna.narnalinks.narnalinks
 database: false
 
 commands:
  site:
     description: Prints a vote link in the chat section.
     aliases: [website, site]
     permission: narnalinks.site
     usage: Did you mean /site ?
  vote:
     description: Prints a link of your site in the chat section.
     aliases: [votesite, vot, vite]
     permission: narnalinks.vote
     usage: Did you mean /vote ?
  donate:
     description: Prints a link of your donating page in the chat section.
     aliases: [pay, shop, packages, package]
     permission: narnalinks.donate
     usage: Did you mean /donate ?
  contact:
     description: Prints a link of your contact page in the chat section.
     aliases: [modreq, griefed, support]
     permission: narnalinks.contact
     usage: Did you mean /contact ?
  dynmap:
     description: Prints a link of your dynmpa in the chat section.
     aliases: [modreq, griefed, support]
     permission: narnalinks.contact
     usage: Did you mean /contact ?
